package app.k9mail.backend.demo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J2\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0&H\u0016J\b\u0010\'\u001a\u00020\u000bH\u0002J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020 2\u0006\u0010-\u001a\u00020\u000bH\u0016J\u001e\u0010.\u001a\u00020 2\u0006\u0010-\u001a\u00020\u000b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0&H\u0016J\u0018\u0010/\u001a\u00020 2\u0006\u0010-\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0016J \u00101\u001a\u00020 2\u0006\u00102\u001a\u0002032\u0006\u0010-\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0016J\u0018\u00104\u001a\u00020 2\u0006\u0010-\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0016J\u0010\u00105\u001a\u00020 2\u0006\u0010-\u001a\u00020\u000bH\u0016J\u001e\u00106\u001a\u00020 2\u0006\u0010-\u001a\u00020\u000b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0&H\u0016J(\u00107\u001a\u00020 2\u0006\u0010-\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000b2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0016J\u001a\u0010<\u001a\u0004\u0018\u00010\u000b2\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000bH\u0016J\u0010\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u000bH\u0002J\u0018\u0010A\u001a\u00020B2\u0006\u0010-\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000bH\u0002J\u0010\u0010C\u001a\u00020 2\u0006\u0010-\u001a\u00020\u000bH\u0016J2\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0&H\u0016J2\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0&H\u0016J\u0018\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`GH\u0002J\b\u0010H\u001a\u00020 H\u0016JH\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000b0&2\u0006\u0010-\u001a\u00020\u000b2\b\u0010J\u001a\u0004\u0018\u00010\u000b2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010L2\u000e\u0010N\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010L2\u0006\u0010O\u001a\u00020\u0006H\u0016J\u0010\u0010P\u001a\u00020 2\u0006\u0010Q\u001a\u00020BH\u0016J.\u0010R\u001a\u00020 2\u0006\u0010-\u001a\u00020\u000b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0&2\u0006\u0010S\u001a\u00020M2\u0006\u0010T\u001a\u00020\u0006H\u0016J \u0010U\u001a\u00020 2\u0006\u0010-\u001a\u00020\u000b2\u0006\u00102\u001a\u0002032\u0006\u0010V\u001a\u00020WH\u0016J\u0018\u0010X\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020BH\u0016J\u0014\u0010Y\u001a\u00020Z*\u00020B2\u0006\u0010[\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007R\'\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0015\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0014\u0010\u0017\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0014\u0010\u0019\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0014\u0010\u001b\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0007R\u0014\u0010\u001d\u001a\u00020\u0006X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007\u00a8\u0006\\"}, d2 = {"Lapp/k9mail/backend/demo/DemoBackend;", "Lcom/fsck/k9/backend/api/Backend;", "backendStorage", "Lcom/fsck/k9/backend/api/BackendStorage;", "(Lcom/fsck/k9/backend/api/BackendStorage;)V", "isDeleteMoveToTrash", "", "()Z", "isPushCapable", "messageStoreInfo", "", "", "Lapp/k9mail/backend/demo/FolderData;", "getMessageStoreInfo", "()Ljava/util/Map;", "messageStoreInfo$delegate", "Lkotlin/Lazy;", "supportsCopy", "getSupportsCopy", "supportsExpunge", "getSupportsExpunge", "supportsFlags", "getSupportsFlags", "supportsMove", "getSupportsMove", "supportsSearchByDate", "getSupportsSearchByDate", "supportsTrashFolder", "getSupportsTrashFolder", "supportsUpload", "getSupportsUpload", "checkIncomingServerSettings", "", "checkOutgoingServerSettings", "copyMessages", "sourceFolderServerId", "targetFolderServerId", "messageServerIds", "", "createNewServerId", "createPusher", "Lcom/fsck/k9/backend/api/BackendPusher;", "callback", "Lcom/fsck/k9/backend/api/BackendPusherCallback;", "deleteAllMessages", "folderServerId", "deleteMessages", "downloadCompleteMessage", "messageServerId", "downloadMessage", "syncConfig", "Lcom/fsck/k9/backend/api/SyncConfig;", "downloadMessageStructure", "expunge", "expungeMessages", "fetchPart", "part", "Lcom/fsck/k9/mail/Part;", "bodyFactory", "Lcom/fsck/k9/mail/BodyFactory;", "findByMessageId", "messageId", "getResourceAsStream", "Ljava/io/InputStream;", "name", "loadMessage", "Lcom/fsck/k9/mail/Message;", "markAllAsRead", "moveMessages", "moveMessagesAndMarkAsRead", "readMessageStoreInfo", "Lapp/k9mail/backend/demo/MessageStoreInfo;", "refreshFolderList", "search", "query", "requiredFlags", "", "Lcom/fsck/k9/mail/Flag;", "forbiddenFlags", "performFullTextSearch", "sendMessage", "message", "setFlag", "flag", "newState", "sync", "listener", "Lcom/fsck/k9/backend/api/SyncListener;", "uploadMessage", "copy", "Lcom/fsck/k9/mail/internet/MimeMessage;", "uid", "demo_debug"})
public final class DemoBackend implements com.fsck.k9.backend.api.Backend {
    private final com.fsck.k9.backend.api.BackendStorage backendStorage = null;
    private final kotlin.Lazy messageStoreInfo$delegate = null;
    private final boolean supportsFlags = true;
    private final boolean supportsExpunge = false;
    private final boolean supportsMove = true;
    private final boolean supportsCopy = true;
    private final boolean supportsUpload = true;
    private final boolean supportsTrashFolder = true;
    private final boolean supportsSearchByDate = false;
    private final boolean isPushCapable = false;
    private final boolean isDeleteMoveToTrash = true;
    
    public DemoBackend(@org.jetbrains.annotations.NotNull
    com.fsck.k9.backend.api.BackendStorage backendStorage) {
        super();
    }
    
    private final java.util.Map<java.lang.String, app.k9mail.backend.demo.FolderData> getMessageStoreInfo() {
        return null;
    }
    
    @java.lang.Override
    public boolean getSupportsFlags() {
        return false;
    }
    
    @java.lang.Override
    public boolean getSupportsExpunge() {
        return false;
    }
    
    @java.lang.Override
    public boolean getSupportsMove() {
        return false;
    }
    
    @java.lang.Override
    public boolean getSupportsCopy() {
        return false;
    }
    
    @java.lang.Override
    public boolean getSupportsUpload() {
        return false;
    }
    
    @java.lang.Override
    public boolean getSupportsTrashFolder() {
        return false;
    }
    
    @java.lang.Override
    public boolean getSupportsSearchByDate() {
        return false;
    }
    
    @java.lang.Override
    public boolean isPushCapable() {
        return false;
    }
    
    @java.lang.Override
    public boolean isDeleteMoveToTrash() {
        return false;
    }
    
    @java.lang.Override
    public void refreshFolderList() {
    }
    
    @java.lang.Override
    public void sync(@org.jetbrains.annotations.NotNull
    java.lang.String folderServerId, @org.jetbrains.annotations.NotNull
    com.fsck.k9.backend.api.SyncConfig syncConfig, @org.jetbrains.annotations.NotNull
    com.fsck.k9.backend.api.SyncListener listener) {
    }
    
    @java.lang.Override
    public void downloadMessage(@org.jetbrains.annotations.NotNull
    com.fsck.k9.backend.api.SyncConfig syncConfig, @org.jetbrains.annotations.NotNull
    java.lang.String folderServerId, @org.jetbrains.annotations.NotNull
    java.lang.String messageServerId) {
    }
    
    @java.lang.Override
    public void downloadMessageStructure(@org.jetbrains.annotations.NotNull
    java.lang.String folderServerId, @org.jetbrains.annotations.NotNull
    java.lang.String messageServerId) {
    }
    
    @java.lang.Override
    public void downloadCompleteMessage(@org.jetbrains.annotations.NotNull
    java.lang.String folderServerId, @org.jetbrains.annotations.NotNull
    java.lang.String messageServerId) {
    }
    
    @java.lang.Override
    public void setFlag(@org.jetbrains.annotations.NotNull
    java.lang.String folderServerId, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> messageServerIds, @org.jetbrains.annotations.NotNull
    com.fsck.k9.mail.Flag flag, boolean newState) {
    }
    
    @java.lang.Override
    public void markAllAsRead(@org.jetbrains.annotations.NotNull
    java.lang.String folderServerId) {
    }
    
    @java.lang.Override
    public void expunge(@org.jetbrains.annotations.NotNull
    java.lang.String folderServerId) {
    }
    
    @java.lang.Override
    public void expungeMessages(@org.jetbrains.annotations.NotNull
    java.lang.String folderServerId, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> messageServerIds) {
    }
    
    @java.lang.Override
    public void deleteMessages(@org.jetbrains.annotations.NotNull
    java.lang.String folderServerId, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> messageServerIds) {
    }
    
    @java.lang.Override
    public void deleteAllMessages(@org.jetbrains.annotations.NotNull
    java.lang.String folderServerId) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> moveMessages(@org.jetbrains.annotations.NotNull
    java.lang.String sourceFolderServerId, @org.jetbrains.annotations.NotNull
    java.lang.String targetFolderServerId, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> messageServerIds) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> moveMessagesAndMarkAsRead(@org.jetbrains.annotations.NotNull
    java.lang.String sourceFolderServerId, @org.jetbrains.annotations.NotNull
    java.lang.String targetFolderServerId, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> messageServerIds) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> copyMessages(@org.jetbrains.annotations.NotNull
    java.lang.String sourceFolderServerId, @org.jetbrains.annotations.NotNull
    java.lang.String targetFolderServerId, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> messageServerIds) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.List<java.lang.String> search(@org.jetbrains.annotations.NotNull
    java.lang.String folderServerId, @org.jetbrains.annotations.Nullable
    java.lang.String query, @org.jetbrains.annotations.Nullable
    java.util.Set<? extends com.fsck.k9.mail.Flag> requiredFlags, @org.jetbrains.annotations.Nullable
    java.util.Set<? extends com.fsck.k9.mail.Flag> forbiddenFlags, boolean performFullTextSearch) {
        return null;
    }
    
    @java.lang.Override
    public void fetchPart(@org.jetbrains.annotations.NotNull
    java.lang.String folderServerId, @org.jetbrains.annotations.NotNull
    java.lang.String messageServerId, @org.jetbrains.annotations.NotNull
    com.fsck.k9.mail.Part part, @org.jetbrains.annotations.NotNull
    com.fsck.k9.mail.BodyFactory bodyFactory) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String findByMessageId(@org.jetbrains.annotations.NotNull
    java.lang.String folderServerId, @org.jetbrains.annotations.NotNull
    java.lang.String messageId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String uploadMessage(@org.jetbrains.annotations.NotNull
    java.lang.String folderServerId, @org.jetbrains.annotations.NotNull
    com.fsck.k9.mail.Message message) {
        return null;
    }
    
    @java.lang.Override
    public void checkIncomingServerSettings() {
    }
    
    @java.lang.Override
    public void checkOutgoingServerSettings() {
    }
    
    @java.lang.Override
    public void sendMessage(@org.jetbrains.annotations.NotNull
    com.fsck.k9.mail.Message message) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.fsck.k9.backend.api.BackendPusher createPusher(@org.jetbrains.annotations.NotNull
    com.fsck.k9.backend.api.BackendPusherCallback callback) {
        return null;
    }
    
    private final java.lang.String createNewServerId() {
        return null;
    }
    
    private final com.fsck.k9.mail.internet.MimeMessage copy(com.fsck.k9.mail.Message $this$copy, java.lang.String uid) {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlin.ExperimentalStdlibApi.class})
    private final java.util.Map<java.lang.String, app.k9mail.backend.demo.FolderData> readMessageStoreInfo() {
        return null;
    }
    
    private final com.fsck.k9.mail.Message loadMessage(java.lang.String folderServerId, java.lang.String messageServerId) {
        return null;
    }
    
    private final java.io.InputStream getResourceAsStream(java.lang.String name) {
        return null;
    }
}