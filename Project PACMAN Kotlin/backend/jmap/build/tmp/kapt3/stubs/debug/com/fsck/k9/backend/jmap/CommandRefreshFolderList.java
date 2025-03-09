package com.fsck.k9.backend.jmap;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u001b\u001a\u00020\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\fR\u0018\u0010\r\u001a\u00020\u000e*\u00020\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lcom/fsck/k9/backend/jmap/CommandRefreshFolderList;", "", "backendStorage", "Lcom/fsck/k9/backend/api/BackendStorage;", "jmapClient", "Lrs/ltt/jmap/client/JmapClient;", "accountId", "", "(Lcom/fsck/k9/backend/api/BackendStorage;Lrs/ltt/jmap/client/JmapClient;Ljava/lang/String;)V", "isPermanentError", "", "Lrs/ltt/jmap/client/api/MethodErrorResponseException;", "(Lrs/ltt/jmap/client/api/MethodErrorResponseException;)Z", "type", "Lcom/fsck/k9/mail/FolderType;", "Lrs/ltt/jmap/common/entity/Mailbox;", "getType", "(Lrs/ltt/jmap/common/entity/Mailbox;)Lcom/fsck/k9/mail/FolderType;", "fetchAllMailboxChanges", "", "folderUpdater", "Lcom/fsck/k9/backend/api/BackendFolderUpdater;", "state", "fetchMailboxChanges", "Lcom/fsck/k9/backend/jmap/CommandRefreshFolderList$UpdateState;", "fetchMailboxUpdates", "fetchMailboxes", "refreshFolderList", "Companion", "UpdateState", "jmap_debug"})
public final class CommandRefreshFolderList {
    private final com.fsck.k9.backend.api.BackendStorage backendStorage = null;
    private final rs.ltt.jmap.client.JmapClient jmapClient = null;
    private final java.lang.String accountId = null;
    @org.jetbrains.annotations.NotNull
    public static final com.fsck.k9.backend.jmap.CommandRefreshFolderList.Companion Companion = null;
    private static final java.lang.String STATE = "jmapState";
    private static final java.lang.String ERROR_SERVER_UNAVAILABLE = "serverUnavailable";
    private static final java.lang.String ERROR_CANNOT_CALCULATE_CHANGES = "cannotCalculateChanges";
    
    public CommandRefreshFolderList(@org.jetbrains.annotations.NotNull
    com.fsck.k9.backend.api.BackendStorage backendStorage, @org.jetbrains.annotations.NotNull
    rs.ltt.jmap.client.JmapClient jmapClient, @org.jetbrains.annotations.NotNull
    java.lang.String accountId) {
        super();
    }
    
    public final void refreshFolderList() {
    }
    
    private final void fetchMailboxes(com.fsck.k9.backend.api.BackendFolderUpdater folderUpdater) {
    }
    
    private final void fetchMailboxUpdates(com.fsck.k9.backend.api.BackendFolderUpdater folderUpdater, java.lang.String state) {
    }
    
    private final void fetchAllMailboxChanges(com.fsck.k9.backend.api.BackendFolderUpdater folderUpdater, java.lang.String state) {
    }
    
    private final com.fsck.k9.backend.jmap.CommandRefreshFolderList.UpdateState fetchMailboxChanges(com.fsck.k9.backend.api.BackendFolderUpdater folderUpdater, java.lang.String state) {
        return null;
    }
    
    private final com.fsck.k9.mail.FolderType getType(rs.ltt.jmap.common.entity.Mailbox $this$type) {
        return null;
    }
    
    private final boolean isPermanentError(rs.ltt.jmap.client.api.MethodErrorResponseException $this$isPermanentError) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/fsck/k9/backend/jmap/CommandRefreshFolderList$UpdateState;", "", "state", "", "hasMoreChanges", "", "(Ljava/lang/String;Z)V", "getHasMoreChanges", "()Z", "getState", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "jmap_debug"})
    static final class UpdateState {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String state = null;
        private final boolean hasMoreChanges = false;
        
        @org.jetbrains.annotations.NotNull
        public final com.fsck.k9.backend.jmap.CommandRefreshFolderList.UpdateState copy(@org.jetbrains.annotations.NotNull
        java.lang.String state, boolean hasMoreChanges) {
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
        
        public UpdateState(@org.jetbrains.annotations.NotNull
        java.lang.String state, boolean hasMoreChanges) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getState() {
            return null;
        }
        
        public final boolean component2() {
            return false;
        }
        
        public final boolean getHasMoreChanges() {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/fsck/k9/backend/jmap/CommandRefreshFolderList$Companion;", "", "()V", "ERROR_CANNOT_CALCULATE_CHANGES", "", "ERROR_SERVER_UNAVAILABLE", "STATE", "jmap_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}