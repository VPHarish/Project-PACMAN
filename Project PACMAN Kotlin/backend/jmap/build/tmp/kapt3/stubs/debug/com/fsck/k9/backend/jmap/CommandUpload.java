package com.fsck.k9.backend.jmap;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001a\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\t*\u00020\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lcom/fsck/k9/backend/jmap/CommandUpload;", "", "jmapClient", "Lrs/ltt/jmap/client/JmapClient;", "okHttpClient", "Lokhttp3/OkHttpClient;", "httpAuthentication", "Lrs/ltt/jmap/client/http/HttpAuthentication;", "accountId", "", "(Lrs/ltt/jmap/client/JmapClient;Lokhttp3/OkHttpClient;Lrs/ltt/jmap/client/http/HttpAuthentication;Ljava/lang/String;)V", "moshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "serverEmailId", "Lrs/ltt/jmap/common/method/response/email/ImportEmailMethodResponse;", "getServerEmailId", "(Lrs/ltt/jmap/common/method/response/email/ImportEmailMethodResponse;)Ljava/lang/String;", "importEmailBlob", "uploadResponse", "Lcom/fsck/k9/backend/jmap/JmapUploadResponse;", "folderServerId", "uploadMessage", "message", "Lcom/fsck/k9/mail/Message;", "uploadMessageAsBlob", "Companion", "jmap_debug"})
public final class CommandUpload {
    private final rs.ltt.jmap.client.JmapClient jmapClient = null;
    private final okhttp3.OkHttpClient okHttpClient = null;
    private final rs.ltt.jmap.client.http.HttpAuthentication httpAuthentication = null;
    private final java.lang.String accountId = null;
    private final com.squareup.moshi.Moshi moshi = null;
    @org.jetbrains.annotations.NotNull
    public static final com.fsck.k9.backend.jmap.CommandUpload.Companion Companion = null;
    private static final java.lang.String LOCAL_EMAIL_ID = "t1";
    
    public CommandUpload(@org.jetbrains.annotations.NotNull
    rs.ltt.jmap.client.JmapClient jmapClient, @org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull
    rs.ltt.jmap.client.http.HttpAuthentication httpAuthentication, @org.jetbrains.annotations.NotNull
    java.lang.String accountId) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String uploadMessage(@org.jetbrains.annotations.NotNull
    java.lang.String folderServerId, @org.jetbrains.annotations.NotNull
    com.fsck.k9.mail.Message message) {
        return null;
    }
    
    private final com.fsck.k9.backend.jmap.JmapUploadResponse uploadMessageAsBlob(com.fsck.k9.mail.Message message) {
        return null;
    }
    
    private final java.lang.String importEmailBlob(com.fsck.k9.backend.jmap.JmapUploadResponse uploadResponse, java.lang.String folderServerId) {
        return null;
    }
    
    private final java.lang.String getServerEmailId(rs.ltt.jmap.common.method.response.email.ImportEmailMethodResponse $this$serverEmailId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/fsck/k9/backend/jmap/CommandUpload$Companion;", "", "()V", "LOCAL_EMAIL_ID", "", "jmap_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}