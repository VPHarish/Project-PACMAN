package com.fsck.k9.backend.jmap;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005J$\u0010\n\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\f\u0010\u0011\u001a\u00020\u0005*\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/fsck/k9/backend/jmap/CommandSetFlag;", "", "jmapClient", "Lrs/ltt/jmap/client/JmapClient;", "accountId", "", "(Lrs/ltt/jmap/client/JmapClient;Ljava/lang/String;)V", "markAllAsRead", "", "folderServerId", "setFlag", "messageServerIds", "", "flag", "Lcom/fsck/k9/mail/Flag;", "newState", "", "toKeyword", "jmap_debug"})
public final class CommandSetFlag {
    private final rs.ltt.jmap.client.JmapClient jmapClient = null;
    private final java.lang.String accountId = null;
    
    public CommandSetFlag(@org.jetbrains.annotations.NotNull
    rs.ltt.jmap.client.JmapClient jmapClient, @org.jetbrains.annotations.NotNull
    java.lang.String accountId) {
        super();
    }
    
    public final void setFlag(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> messageServerIds, @org.jetbrains.annotations.NotNull
    com.fsck.k9.mail.Flag flag, boolean newState) {
    }
    
    public final void markAllAsRead(@org.jetbrains.annotations.NotNull
    java.lang.String folderServerId) {
    }
    
    private final java.lang.String toKeyword(com.fsck.k9.mail.Flag $this$toKeyword) {
        return null;
    }
}