package com.fsck.k9.ui.settings.account

import androidx.preference.PreferenceDataStore
import com.fsck.k9.Account
import com.fsck.k9.Account.SpecialFolderSelection
import com.fsck.k9.NotificationLight
import com.fsck.k9.NotificationVibration
import com.fsck.k9.Preferences
import com.fsck.k9.job.K9JobManager
import com.fsck.k9.notification.NotificationChannelManager
import com.fsck.k9.notification.NotificationController
import java.util.Base64
import java.util.concurrent.ExecutorService
import org.openquantumsafe.Signature

class AccountSettingsDataStore(
    private val preferences: Preferences,
    private val executorService: ExecutorService,
    private val account: Account,
    private val jobManager: K9JobManager,
    private val notificationChannelManager: NotificationChannelManager,
    private val notificationController: NotificationController
) : PreferenceDataStore() {
    private var notificationSettingsChanged = false

    override fun getBoolean(key: String, defValue: Boolean): Boolean {
        return when (key) {
            "mark_message_as_read_on_view" -> account.isMarkMessageAsReadOnView
            "mark_message_as_read_on_delete" -> account.isMarkMessageAsReadOnDelete
            "account_sync_remote_deletetions" -> account.isSyncRemoteDeletions
            "always_show_cc_bcc" -> account.isAlwaysShowCcBcc
            "message_read_receipt" -> account.isMessageReadReceipt
            "default_quoted_text_shown" -> account.isDefaultQuotedTextShown
            "reply_after_quote" -> account.isReplyAfterQuote
            "strip_signature" -> account.isStripSignature
            "account_notify" -> account.isNotifyNewMail
            "account_notify_self" -> account.isNotifySelfNewMail
            "account_notify_contacts_mail_only" -> account.isNotifyContactsMailOnly
            "account_notify_sync" -> account.isNotifySync
            "openpgp_hide_sign_only" -> account.isOpenPgpHideSignOnly
            "openpgp_encrypt_subject" -> account.isOpenPgpEncryptSubject
            "openpgp_encrypt_all_drafts" -> account.isOpenPgpEncryptAllDrafts
            "autocrypt_prefer_encrypt" -> account.autocryptPreferEncryptMutual
            "upload_sent_messages" -> account.isUploadSentMessages
            "ignore_chat_messages" -> account.isIgnoreChatMessages
            else -> defValue
        }
    }

    override fun putBoolean(key: String, value: Boolean) {
        when (key) {
            "mark_message_as_read_on_view" -> account.isMarkMessageAsReadOnView = value
            "mark_message_as_read_on_delete" -> account.isMarkMessageAsReadOnDelete = value
            "account_sync_remote_deletetions" -> account.isSyncRemoteDeletions = value
            "always_show_cc_bcc" -> account.isAlwaysShowCcBcc = value
            "message_read_receipt" -> account.isMessageReadReceipt = value
            "default_quoted_text_shown" -> account.isDefaultQuotedTextShown = value
            "reply_after_quote" -> account.isReplyAfterQuote = value
            "strip_signature" -> account.isStripSignature = value
            "account_notify" -> account.isNotifyNewMail = value
            "account_notify_self" -> account.isNotifySelfNewMail = value
            "account_notify_contacts_mail_only" -> account.isNotifyContactsMailOnly = value
            "account_notify_sync" -> account.isNotifySync = value
            "openpgp_hide_sign_only" -> account.isOpenPgpHideSignOnly = value
            "openpgp_encrypt_subject" -> account.isOpenPgpEncryptSubject = value
            "openpgp_encrypt_all_drafts" -> account.isOpenPgpEncryptAllDrafts = value
            "autocrypt_prefer_encrypt" -> account.autocryptPreferEncryptMutual = value
            "upload_sent_messages" -> account.isUploadSentMessages = value
            "ignore_chat_messages" -> account.isIgnoreChatMessages = value
            else -> return
        }

        saveSettingsInBackground()
    }

    override fun getInt(key: String?, defValue: Int): Int {
        return when (key) {
            "chip_color" -> account.chipColor
            else -> defValue
        }
    }

    override fun putInt(key: String?, value: Int) {
        when (key) {
            "chip_color" -> setAccountColor(value)
            else -> return
        }

        saveSettingsInBackground()
    }

    override fun getLong(key: String?, defValue: Long): Long {
        return when (key) {
            "openpgp_key" -> account.openPgpKey
            else -> defValue
        }
    }

    override fun putLong(key: String?, value: Long) {
        when (key) {
            "openpgp_key" -> account.openPgpKey = value
            else -> return
        }

        saveSettingsInBackground()
    }

    override fun getString(key: String, defValue: String?): String? {
        return when (key) {
            "account_description" -> account.name
            "show_pictures_enum" -> account.showPictures.name
            "account_display_count" -> account.displayCount.toString()
            "account_message_age" -> account.maximumPolledMessageAge.toString()
            "account_autodownload_size" -> account.maximumAutoDownloadMessageSize.toString()
            "account_check_frequency" -> account.automaticCheckIntervalMinutes.toString()
            "folder_sync_mode" -> account.folderSyncMode.name
            "folder_push_mode" -> account.folderPushMode.name
            "delete_policy" -> account.deletePolicy.name
            "expunge_policy" -> account.expungePolicy.name
            "max_push_folders" -> account.maxPushFolders.toString()
            "idle_refresh_period" -> account.idleRefreshMinutes.toString()
            "message_format" -> account.messageFormat.name
            "quote_style" -> account.quoteStyle.name
            "account_quote_prefix" -> account.quotePrefix
            "account_setup_auto_expand_folder" -> {
                loadSpecialFolder(account.autoExpandFolderId, SpecialFolderSelection.MANUAL)
            }
            "folder_display_mode" -> account.folderDisplayMode.name
            "folder_target_mode" -> account.folderTargetMode.name
            "searchable_folders" -> account.searchableFolders.name
            "archive_folder" -> loadSpecialFolder(account.archiveFolderId, account.archiveFolderSelection)
            "drafts_folder" -> loadSpecialFolder(account.draftsFolderId, account.draftsFolderSelection)
            "sent_folder" -> loadSpecialFolder(account.sentFolderId, account.sentFolderSelection)
            "spam_folder" -> loadSpecialFolder(account.spamFolderId, account.spamFolderSelection)
            "trash_folder" -> loadSpecialFolder(account.trashFolderId, account.trashFolderSelection)
            "folder_notify_new_mail_mode" -> account.folderNotifyNewMailMode.name
            "account_combined_vibration" -> getCombinedVibrationValue()
            "account_remote_search_num_results" -> account.remoteSearchNumResults.toString()
            "account_ringtone" -> account.notificationSettings.ringtone
            "notification_light" -> account.notificationSettings.light.name
            "pq_algorithm_type" -> account.pqAlgorithm
            else -> defValue
        }
    }

    override fun putString(key: String, value: String?) {
        if (value == null) return

        when (key) {
            "account_description" -> account.name = value
            "show_pictures_enum" -> account.showPictures = Account.ShowPictures.valueOf(value)
            "account_display_count" -> account.displayCount = value.toInt()
            "account_message_age" -> account.maximumPolledMessageAge = value.toInt()
            "account_autodownload_size" -> account.maximumAutoDownloadMessageSize = value.toInt()
            "account_check_frequency" -> {
                if (account.updateAutomaticCheckIntervalMinutes(value.toInt())) {
                    reschedulePoll()
                }
            }
            "folder_sync_mode" -> {
                if (account.updateFolderSyncMode(Account.FolderMode.valueOf(value))) {
                    reschedulePoll()
                }
            }
            "folder_push_mode" -> account.folderPushMode = Account.FolderMode.valueOf(value)
            "delete_policy" -> account.deletePolicy = Account.DeletePolicy.valueOf(value)
            "expunge_policy" -> account.expungePolicy = Account.Expunge.valueOf(value)
            "max_push_folders" -> account.maxPushFolders = value.toInt()
            "idle_refresh_period" -> account.idleRefreshMinutes = value.toInt()
            "message_format" -> account.messageFormat = Account.MessageFormat.valueOf(value)
            "quote_style" -> account.quoteStyle = Account.QuoteStyle.valueOf(value)
            "account_quote_prefix" -> account.quotePrefix = value
            "account_setup_auto_expand_folder" -> account.autoExpandFolderId = extractFolderId(value)
            "folder_display_mode" -> account.folderDisplayMode = Account.FolderMode.valueOf(value)
            "folder_target_mode" -> account.folderTargetMode = Account.FolderMode.valueOf(value)
            "searchable_folders" -> account.searchableFolders = Account.Searchable.valueOf(value)
            "archive_folder" -> saveSpecialFolderSelection(value, account::setArchiveFolderId)
            "drafts_folder" -> saveSpecialFolderSelection(value, account::setDraftsFolderId)
            "sent_folder" -> saveSpecialFolderSelection(value, account::setSentFolderId)
            "spam_folder" -> saveSpecialFolderSelection(value, account::setSpamFolderId)
            "trash_folder" -> saveSpecialFolderSelection(value, account::setTrashFolderId)
            "folder_notify_new_mail_mode" -> account.folderNotifyNewMailMode = Account.FolderMode.valueOf(value)
            "account_combined_vibration" -> setCombinedVibrationValue(value)
            "account_remote_search_num_results" -> account.remoteSearchNumResults = value.toInt()
            "account_ringtone" -> setNotificationSound(value)
            "notification_light" -> setNotificationLight(value)
            "pq_algorithm_type" -> changePQAlgorithmType(value)
            else -> return
        }

        saveSettingsInBackground()
    }

    private fun changePQAlgorithmType(value: String) {
        account.pqAlgorithm = value
        account.pqKeysetExists = true
        val signature = Signature(value)
        signature.generate_keypair()
        account.pqPublicKey = Base64.getMimeEncoder().encodeToString(signature.export_public_key())
        account.pqPrivateKey = Base64.getMimeEncoder().encodeToString(signature.export_secret_key())
    }

    private fun setAccountColor(color: Int) {
        if (color != account.chipColor) {
            account.chipColor = color

            if (account.notificationSettings.light == NotificationLight.AccountColor) {
                notificationSettingsChanged = true
            }
        }
    }

    private fun setNotificationSound(value: String) {
        account.notificationSettings.let { notificationSettings ->
            if (!notificationSettings.isRingEnabled || notificationSettings.ringtone != value) {
                account.updateNotificationSettings { it.copy(isRingEnabled = true, ringtone = value) }
                notificationSettingsChanged = true
            }
        }
    }

    private fun setNotificationLight(value: String) {
        val light = NotificationLight.valueOf(value)
        if (light != account.notificationSettings.light) {
            account.updateNotificationSettings { it.copy(light = light) }
            notificationSettingsChanged = true
        }
    }

    fun saveSettingsInBackground() {
        executorService.execute {
            if (notificationSettingsChanged) {
                notificationChannelManager.recreateMessagesNotificationChannel(account)
                notificationController.restoreNewMailNotifications(listOf(account))
            }

            notificationSettingsChanged = false
            saveSettings()
        }
    }

    private fun saveSettings() {
        preferences.saveAccount(account)
    }

    private fun reschedulePoll() {
        jobManager.scheduleMailSync(account)
    }

    private fun extractFolderId(preferenceValue: String): Long? {
        val folderValue = preferenceValue.substringAfter(FolderListPreference.FOLDER_VALUE_DELIMITER)
        return if (folderValue == FolderListPreference.NO_FOLDER_VALUE) null else folderValue.toLongOrNull()
    }

    private fun saveSpecialFolderSelection(
        preferenceValue: String,
        specialFolderSetter: (Long?, SpecialFolderSelection) -> Unit
    ) {
        val specialFolder = extractFolderId(preferenceValue)

        val specialFolderSelection = if (preferenceValue.startsWith(FolderListPreference.AUTOMATIC_PREFIX)) {
            SpecialFolderSelection.AUTOMATIC
        } else {
            SpecialFolderSelection.MANUAL
        }

        specialFolderSetter(specialFolder, specialFolderSelection)
    }

    private fun loadSpecialFolder(specialFolderId: Long?, specialFolderSelection: SpecialFolderSelection): String {
        val prefix = when (specialFolderSelection) {
            SpecialFolderSelection.AUTOMATIC -> FolderListPreference.AUTOMATIC_PREFIX
            SpecialFolderSelection.MANUAL -> FolderListPreference.MANUAL_PREFIX
        }

        return prefix + (specialFolderId?.toString() ?: FolderListPreference.NO_FOLDER_VALUE)
    }

    private fun getCombinedVibrationValue(): String {
        return with(account.notificationSettings.vibration) {
            VibrationPreference.encode(
                isVibrationEnabled = isEnabled,
                vibratePattern = pattern,
                vibrationTimes = repeatCount
            )
        }
    }

    private fun setCombinedVibrationValue(value: String) {
        val (isVibrationEnabled, vibrationPattern, vibrationTimes) = VibrationPreference.decode(value)
        account.updateNotificationSettings { notificationSettings ->
            notificationSettings.copy(
                vibration = NotificationVibration(
                    isEnabled = isVibrationEnabled,
                    pattern = vibrationPattern,
                    repeatCount = vibrationTimes,
                )
            )
        }
        notificationSettingsChanged = true
    }
}
