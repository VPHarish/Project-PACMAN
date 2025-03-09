package com.fsck.k9.backend.jmap;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 @2\u00020\u0001:\u0001@B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0002J?\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002\u00a2\u0006\u0002\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J,\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\t0(H\u0002J7\u0010)\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0002\u00a2\u0006\u0002\u0010*J/\u0010+\u001a\b\u0012\u0004\u0012\u00020,0!2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0!2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0/H\u0002\u00a2\u0006\u0002\u00100JF\u00101\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\t2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\t0!2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\t0(2\b\u00104\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J&\u00105\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\t0(H\u0002J\u001e\u00106\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aJ \u00107\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u00108\u001a\u00020,H\u0002J\u0016\u00109\u001a\u00020\u0011*\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0002J\u000e\u0010:\u001a\u0004\u0018\u00010;*\u00020\tH\u0002J \u0010<\u001a\b\u0012\u0004\u0012\u00020;0(*\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020>\u0018\u00010=H\u0002J\u0014\u0010?\u001a\u00020\"*\u00020,2\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006A"}, d2 = {"Lcom/fsck/k9/backend/jmap/CommandSync;", "", "backendStorage", "Lcom/fsck/k9/backend/api/BackendStorage;", "jmapClient", "Lrs/ltt/jmap/client/JmapClient;", "okHttpClient", "Lokhttp3/OkHttpClient;", "accountId", "", "httpAuthentication", "Lrs/ltt/jmap/client/http/HttpAuthentication;", "(Lcom/fsck/k9/backend/api/BackendStorage;Lrs/ltt/jmap/client/JmapClient;Lokhttp3/OkHttpClient;Ljava/lang/String;Lrs/ltt/jmap/client/http/HttpAuthentication;)V", "createEmailQuery", "Lrs/ltt/jmap/common/entity/query/EmailQuery;", "folderServerId", "deltaSync", "", "backendFolder", "Lcom/fsck/k9/backend/api/BackendFolder;", "syncConfig", "Lcom/fsck/k9/backend/api/SyncConfig;", "limit", "", "queryState", "listener", "Lcom/fsck/k9/backend/api/SyncListener;", "(Lcom/fsck/k9/backend/api/BackendFolder;Ljava/lang/String;Lcom/fsck/k9/backend/api/SyncConfig;Ljava/lang/Long;Ljava/lang/String;Lcom/fsck/k9/backend/api/SyncListener;)V", "downloadMessage", "Lcom/fsck/k9/mail/internet/MimeMessage;", "downloadUrl", "Lokhttp3/HttpUrl;", "fetchMessageInfo", "", "Lcom/fsck/k9/backend/jmap/MessageInfo;", "session", "Lrs/ltt/jmap/client/session/Session;", "maxObjectsInGet", "", "emailIds", "", "fullSync", "(Lcom/fsck/k9/backend/api/BackendFolder;Ljava/lang/String;Lcom/fsck/k9/backend/api/SyncConfig;Ljava/lang/Long;Lcom/fsck/k9/backend/api/SyncListener;)V", "getEmailPropertiesFromServer", "Lrs/ltt/jmap/common/entity/Email;", "emailIdsChunk", "properties", "", "(Ljava/util/List;[Ljava/lang/String;)Ljava/util/List;", "handleFolderUpdates", "destroyServerIds", "newServerIds", "newQueryState", "refreshMessageFlags", "sync", "syncFlagsForMessage", "email", "saveQueryState", "toFlag", "Lcom/fsck/k9/mail/Flag;", "toFlags", "", "", "toMessageInfo", "Companion", "jmap_debug"})
public final class CommandSync {
    private final com.fsck.k9.backend.api.BackendStorage backendStorage = null;
    private final rs.ltt.jmap.client.JmapClient jmapClient = null;
    private final okhttp3.OkHttpClient okHttpClient = null;
    private final java.lang.String accountId = null;
    private final rs.ltt.jmap.client.http.HttpAuthentication httpAuthentication = null;
    @org.jetbrains.annotations.NotNull
    public static final com.fsck.k9.backend.jmap.CommandSync.Companion Companion = null;
    private static final java.lang.String EXTRA_QUERY_STATE = "jmapQueryState";
    private static final java.lang.String ERROR_CANNOT_CALCULATE_CHANGES = "cannotCalculateChanges";
    private static final java.lang.String[] INFO_PROPERTIES = {"id", "blobId", "size", "receivedAt", "keywords"};
    private static final java.lang.String[] FLAG_PROPERTIES = {"id", "keywords"};
    
    public CommandSync(@org.jetbrains.annotations.NotNull
    com.fsck.k9.backend.api.BackendStorage backendStorage, @org.jetbrains.annotations.NotNull
    rs.ltt.jmap.client.JmapClient jmapClient, @org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull
    java.lang.String accountId, @org.jetbrains.annotations.NotNull
    rs.ltt.jmap.client.http.HttpAuthentication httpAuthentication) {
        super();
    }
    
    public final void sync(@org.jetbrains.annotations.NotNull
    java.lang.String folderServerId, @org.jetbrains.annotations.NotNull
    com.fsck.k9.backend.api.SyncConfig syncConfig, @org.jetbrains.annotations.NotNull
    com.fsck.k9.backend.api.SyncListener listener) {
    }
    
    private final void fullSync(com.fsck.k9.backend.api.BackendFolder backendFolder, java.lang.String folderServerId, com.fsck.k9.backend.api.SyncConfig syncConfig, java.lang.Long limit, com.fsck.k9.backend.api.SyncListener listener) {
    }
    
    private final rs.ltt.jmap.common.entity.query.EmailQuery createEmailQuery(java.lang.String folderServerId) {
        return null;
    }
    
    private final void deltaSync(com.fsck.k9.backend.api.BackendFolder backendFolder, java.lang.String folderServerId, com.fsck.k9.backend.api.SyncConfig syncConfig, java.lang.Long limit, java.lang.String queryState, com.fsck.k9.backend.api.SyncListener listener) {
    }
    
    private final void handleFolderUpdates(com.fsck.k9.backend.api.BackendFolder backendFolder, java.lang.String folderServerId, java.util.List<java.lang.String> destroyServerIds, java.util.Set<java.lang.String> newServerIds, java.lang.String newQueryState, com.fsck.k9.backend.api.SyncListener listener) {
    }
    
    private final java.util.List<com.fsck.k9.backend.jmap.MessageInfo> fetchMessageInfo(rs.ltt.jmap.client.session.Session session, int maxObjectsInGet, java.util.Set<java.lang.String> emailIds) {
        return null;
    }
    
    private final java.util.List<rs.ltt.jmap.common.entity.Email> getEmailPropertiesFromServer(java.util.List<java.lang.String> emailIdsChunk, java.lang.String[] properties) {
        return null;
    }
    
    private final com.fsck.k9.backend.jmap.MessageInfo toMessageInfo(rs.ltt.jmap.common.entity.Email $this$toMessageInfo, rs.ltt.jmap.client.session.Session session) {
        return null;
    }
    
    private final com.fsck.k9.mail.internet.MimeMessage downloadMessage(okhttp3.HttpUrl downloadUrl) {
        return null;
    }
    
    private final void refreshMessageFlags(com.fsck.k9.backend.api.BackendFolder backendFolder, com.fsck.k9.backend.api.SyncConfig syncConfig, java.util.Set<java.lang.String> emailIds) {
    }
    
    private final void syncFlagsForMessage(com.fsck.k9.backend.api.BackendFolder backendFolder, com.fsck.k9.backend.api.SyncConfig syncConfig, rs.ltt.jmap.common.entity.Email email) {
    }
    
    private final java.util.Set<com.fsck.k9.mail.Flag> toFlags(java.util.Map<java.lang.String, java.lang.Boolean> $this$toFlags) {
        return null;
    }
    
    private final com.fsck.k9.mail.Flag toFlag(java.lang.String $this$toFlag) {
        return null;
    }
    
    private final void saveQueryState(com.fsck.k9.backend.api.BackendFolder $this$saveQueryState, java.lang.String queryState) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/fsck/k9/backend/jmap/CommandSync$Companion;", "", "()V", "ERROR_CANNOT_CALCULATE_CHANGES", "", "EXTRA_QUERY_STATE", "FLAG_PROPERTIES", "", "[Ljava/lang/String;", "INFO_PROPERTIES", "jmap_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}