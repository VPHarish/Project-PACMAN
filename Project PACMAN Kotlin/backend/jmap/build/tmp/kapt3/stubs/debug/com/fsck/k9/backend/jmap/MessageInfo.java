package com.fsck.k9.backend.jmap;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001f"}, d2 = {"Lcom/fsck/k9/backend/jmap/MessageInfo;", "", "serverId", "", "downloadUrl", "Lokhttp3/HttpUrl;", "receivedAt", "Ljava/util/Date;", "flags", "", "Lcom/fsck/k9/mail/Flag;", "(Ljava/lang/String;Lokhttp3/HttpUrl;Ljava/util/Date;Ljava/util/Set;)V", "getDownloadUrl", "()Lokhttp3/HttpUrl;", "getFlags", "()Ljava/util/Set;", "getReceivedAt", "()Ljava/util/Date;", "getServerId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "jmap_debug"})
final class MessageInfo {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String serverId = null;
    @org.jetbrains.annotations.NotNull
    private final okhttp3.HttpUrl downloadUrl = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Date receivedAt = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.Set<com.fsck.k9.mail.Flag> flags = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.fsck.k9.backend.jmap.MessageInfo copy(@org.jetbrains.annotations.NotNull
    java.lang.String serverId, @org.jetbrains.annotations.NotNull
    okhttp3.HttpUrl downloadUrl, @org.jetbrains.annotations.NotNull
    java.util.Date receivedAt, @org.jetbrains.annotations.NotNull
    java.util.Set<? extends com.fsck.k9.mail.Flag> flags) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public MessageInfo(@org.jetbrains.annotations.NotNull
    java.lang.String serverId, @org.jetbrains.annotations.NotNull
    okhttp3.HttpUrl downloadUrl, @org.jetbrains.annotations.NotNull
    java.util.Date receivedAt, @org.jetbrains.annotations.NotNull
    java.util.Set<? extends com.fsck.k9.mail.Flag> flags) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getServerId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final okhttp3.HttpUrl component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final okhttp3.HttpUrl getDownloadUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getReceivedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Set<com.fsck.k9.mail.Flag> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Set<com.fsck.k9.mail.Flag> getFlags() {
        return null;
    }
}