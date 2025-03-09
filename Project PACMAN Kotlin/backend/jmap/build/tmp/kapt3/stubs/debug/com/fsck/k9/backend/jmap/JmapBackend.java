package com.fsck.k9.backend.jmap;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020.H\u0016J4\u00100\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u0001012\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\n05H\u0016J\u0018\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u00020.2\u0006\u0010=\u001a\u00020\nH\u0016J\u001e\u0010>\u001a\u00020.2\u0006\u0010=\u001a\u00020\n2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\n05H\u0016J\u0018\u0010?\u001a\u00020.2\u0006\u0010=\u001a\u00020\n2\u0006\u0010@\u001a\u00020\nH\u0016J \u0010A\u001a\u00020.2\u0006\u0010B\u001a\u00020C2\u0006\u0010=\u001a\u00020\n2\u0006\u0010@\u001a\u00020\nH\u0016J\u0018\u0010D\u001a\u00020.2\u0006\u0010=\u001a\u00020\n2\u0006\u0010@\u001a\u00020\nH\u0016J\u0010\u0010E\u001a\u00020.2\u0006\u0010=\u001a\u00020\nH\u0016J\u001e\u0010F\u001a\u00020.2\u0006\u0010=\u001a\u00020\n2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\n05H\u0016J(\u0010G\u001a\u00020.2\u0006\u0010=\u001a\u00020\n2\u0006\u0010@\u001a\u00020\n2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0016J\u001a\u0010L\u001a\u0004\u0018\u00010\n2\u0006\u0010=\u001a\u00020\n2\u0006\u0010M\u001a\u00020\nH\u0016J\u0010\u0010N\u001a\u00020.2\u0006\u0010=\u001a\u00020\nH\u0016J4\u0010O\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u0001012\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\n05H\u0016J4\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u0001012\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\n05H\u0016J\b\u0010Q\u001a\u00020.H\u0016JH\u0010R\u001a\b\u0012\u0004\u0012\u00020\n052\u0006\u0010=\u001a\u00020\n2\b\u0010S\u001a\u0004\u0018\u00010\n2\u000e\u0010T\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010U2\u000e\u0010W\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010U2\u0006\u0010X\u001a\u00020\u001aH\u0016J\u0010\u0010Y\u001a\u00020.2\u0006\u0010Z\u001a\u00020[H\u0016J.\u0010\\\u001a\u00020.2\u0006\u0010=\u001a\u00020\n2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\n052\u0006\u0010]\u001a\u00020V2\u0006\u0010^\u001a\u00020\u001aH\u0016J \u0010_\u001a\u00020.2\u0006\u0010`\u001a\u00020\n2\u0006\u0010B\u001a\u00020C2\u0006\u0010a\u001a\u00020bH\u0016J\u001a\u0010c\u001a\u0004\u0018\u00010\n2\u0006\u0010=\u001a\u00020\n2\u0006\u0010Z\u001a\u00020[H\u0016J\f\u0010d\u001a\u00020\u0018*\u00020\u0007H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001aX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020\u001aX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0014\u0010!\u001a\u00020\u001aX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0014\u0010#\u001a\u00020\u001aX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0014\u0010%\u001a\u00020\u001aX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0014\u0010\'\u001a\u00020\u001aX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0014\u0010)\u001a\u00020\u001aX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0014\u0010+\u001a\u00020\u001aX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001b\u00a8\u0006e"}, d2 = {"Lcom/fsck/k9/backend/jmap/JmapBackend;", "Lcom/fsck/k9/backend/api/Backend;", "backendStorage", "Lcom/fsck/k9/backend/api/BackendStorage;", "okHttpClient", "Lokhttp3/OkHttpClient;", "config", "Lcom/fsck/k9/backend/jmap/JmapConfig;", "(Lcom/fsck/k9/backend/api/BackendStorage;Lokhttp3/OkHttpClient;Lcom/fsck/k9/backend/jmap/JmapConfig;)V", "accountId", "", "commandDelete", "Lcom/fsck/k9/backend/jmap/CommandDelete;", "commandMove", "Lcom/fsck/k9/backend/jmap/CommandMove;", "commandRefreshFolderList", "Lcom/fsck/k9/backend/jmap/CommandRefreshFolderList;", "commandSetFlag", "Lcom/fsck/k9/backend/jmap/CommandSetFlag;", "commandSync", "Lcom/fsck/k9/backend/jmap/CommandSync;", "commandUpload", "Lcom/fsck/k9/backend/jmap/CommandUpload;", "httpAuthentication", "Lrs/ltt/jmap/client/http/HttpAuthentication;", "isDeleteMoveToTrash", "", "()Z", "isPushCapable", "jmapClient", "Lrs/ltt/jmap/client/JmapClient;", "supportsCopy", "getSupportsCopy", "supportsExpunge", "getSupportsExpunge", "supportsFlags", "getSupportsFlags", "supportsMove", "getSupportsMove", "supportsSearchByDate", "getSupportsSearchByDate", "supportsTrashFolder", "getSupportsTrashFolder", "supportsUpload", "getSupportsUpload", "checkIncomingServerSettings", "", "checkOutgoingServerSettings", "copyMessages", "", "sourceFolderServerId", "targetFolderServerId", "messageServerIds", "", "createJmapClient", "jmapConfig", "createPusher", "Lcom/fsck/k9/backend/api/BackendPusher;", "callback", "Lcom/fsck/k9/backend/api/BackendPusherCallback;", "deleteAllMessages", "folderServerId", "deleteMessages", "downloadCompleteMessage", "messageServerId", "downloadMessage", "syncConfig", "Lcom/fsck/k9/backend/api/SyncConfig;", "downloadMessageStructure", "expunge", "expungeMessages", "fetchPart", "part", "Lcom/fsck/k9/mail/Part;", "bodyFactory", "Lcom/fsck/k9/mail/BodyFactory;", "findByMessageId", "messageId", "markAllAsRead", "moveMessages", "moveMessagesAndMarkAsRead", "refreshFolderList", "search", "query", "requiredFlags", "", "Lcom/fsck/k9/mail/Flag;", "forbiddenFlags", "performFullTextSearch", "sendMessage", "message", "Lcom/fsck/k9/mail/Message;", "setFlag", "flag", "newState", "sync", "folder", "listener", "Lcom/fsck/k9/backend/api/SyncListener;", "uploadMessage", "toHttpAuthentication", "jmap_debug"})
public final class JmapBackend implements com.fsck.k9.backend.api.Backend {
    private final rs.ltt.jmap.client.http.HttpAuthentication httpAuthentication = null;
    private final rs.ltt.jmap.client.JmapClient jmapClient = null;
    private final java.lang.String accountId = null;
    private final com.fsck.k9.backend.jmap.CommandRefreshFolderList commandRefreshFolderList = null;
    private final com.fsck.k9.backend.jmap.CommandSync commandSync = null;
    private final com.fsck.k9.backend.jmap.CommandSetFlag commandSetFlag = null;
    private final com.fsck.k9.backend.jmap.CommandDelete commandDelete = null;
    private final com.fsck.k9.backend.jmap.CommandMove commandMove = null;
    private final com.fsck.k9.backend.jmap.CommandUpload commandUpload = null;
    private final boolean supportsFlags = true;
    private final boolean supportsExpunge = false;
    private final boolean supportsMove = true;
    private final boolean supportsCopy = true;
    private final boolean supportsUpload = true;
    private final boolean supportsTrashFolder = true;
    private final boolean supportsSearchByDate = true;
    private final boolean isPushCapable = false;
    private final boolean isDeleteMoveToTrash = true;
    
    public JmapBackend(@org.jetbrains.annotations.NotNull
    com.fsck.k9.backend.api.BackendStorage backendStorage, @org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull
    com.fsck.k9.backend.jmap.JmapConfig config) {
        super();
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
    java.lang.String folder, @org.jetbrains.annotations.NotNull
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
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> moveMessages(@org.jetbrains.annotations.NotNull
    java.lang.String sourceFolderServerId, @org.jetbrains.annotations.NotNull
    java.lang.String targetFolderServerId, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> messageServerIds) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> moveMessagesAndMarkAsRead(@org.jetbrains.annotations.NotNull
    java.lang.String sourceFolderServerId, @org.jetbrains.annotations.NotNull
    java.lang.String targetFolderServerId, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> messageServerIds) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
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
    
    @org.jetbrains.annotations.Nullable
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
    public void sendMessage(@org.jetbrains.annotations.NotNull
    com.fsck.k9.mail.Message message) {
    }
    
    @java.lang.Override
    public void checkOutgoingServerSettings() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.fsck.k9.backend.api.BackendPusher createPusher(@org.jetbrains.annotations.NotNull
    com.fsck.k9.backend.api.BackendPusherCallback callback) {
        return null;
    }
    
    private final rs.ltt.jmap.client.http.HttpAuthentication toHttpAuthentication(com.fsck.k9.backend.jmap.JmapConfig $this$toHttpAuthentication) {
        return null;
    }
    
    private final rs.ltt.jmap.client.JmapClient createJmapClient(com.fsck.k9.backend.jmap.JmapConfig jmapConfig, rs.ltt.jmap.client.http.HttpAuthentication httpAuthentication) {
        return null;
    }
}