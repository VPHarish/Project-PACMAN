package com.fsck.k9.backend.jmap;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/fsck/k9/backend/jmap/JmapDiscoveryResult;", "", "()V", "AuthenticationFailure", "EndpointNotFoundFailure", "GenericFailure", "JmapAccount", "NoEmailAccountFoundFailure", "Lcom/fsck/k9/backend/jmap/JmapDiscoveryResult$GenericFailure;", "Lcom/fsck/k9/backend/jmap/JmapDiscoveryResult$EndpointNotFoundFailure;", "Lcom/fsck/k9/backend/jmap/JmapDiscoveryResult$AuthenticationFailure;", "Lcom/fsck/k9/backend/jmap/JmapDiscoveryResult$NoEmailAccountFoundFailure;", "Lcom/fsck/k9/backend/jmap/JmapDiscoveryResult$JmapAccount;", "jmap_debug"})
public abstract class JmapDiscoveryResult {
    
    private JmapDiscoveryResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/fsck/k9/backend/jmap/JmapDiscoveryResult$GenericFailure;", "Lcom/fsck/k9/backend/jmap/JmapDiscoveryResult;", "cause", "", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "jmap_debug"})
    public static final class GenericFailure extends com.fsck.k9.backend.jmap.JmapDiscoveryResult {
        @org.jetbrains.annotations.NotNull
        private final java.lang.Throwable cause = null;
        
        public GenericFailure(@org.jetbrains.annotations.NotNull
        java.lang.Throwable cause) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.Throwable getCause() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/fsck/k9/backend/jmap/JmapDiscoveryResult$EndpointNotFoundFailure;", "Lcom/fsck/k9/backend/jmap/JmapDiscoveryResult;", "()V", "jmap_debug"})
    public static final class EndpointNotFoundFailure extends com.fsck.k9.backend.jmap.JmapDiscoveryResult {
        @org.jetbrains.annotations.NotNull
        public static final com.fsck.k9.backend.jmap.JmapDiscoveryResult.EndpointNotFoundFailure INSTANCE = null;
        
        private EndpointNotFoundFailure() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/fsck/k9/backend/jmap/JmapDiscoveryResult$AuthenticationFailure;", "Lcom/fsck/k9/backend/jmap/JmapDiscoveryResult;", "()V", "jmap_debug"})
    public static final class AuthenticationFailure extends com.fsck.k9.backend.jmap.JmapDiscoveryResult {
        @org.jetbrains.annotations.NotNull
        public static final com.fsck.k9.backend.jmap.JmapDiscoveryResult.AuthenticationFailure INSTANCE = null;
        
        private AuthenticationFailure() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/fsck/k9/backend/jmap/JmapDiscoveryResult$NoEmailAccountFoundFailure;", "Lcom/fsck/k9/backend/jmap/JmapDiscoveryResult;", "()V", "jmap_debug"})
    public static final class NoEmailAccountFoundFailure extends com.fsck.k9.backend.jmap.JmapDiscoveryResult {
        @org.jetbrains.annotations.NotNull
        public static final com.fsck.k9.backend.jmap.JmapDiscoveryResult.NoEmailAccountFoundFailure INSTANCE = null;
        
        private NoEmailAccountFoundFailure() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/fsck/k9/backend/jmap/JmapDiscoveryResult$JmapAccount;", "Lcom/fsck/k9/backend/jmap/JmapDiscoveryResult;", "accountId", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "jmap_debug"})
    public static final class JmapAccount extends com.fsck.k9.backend.jmap.JmapDiscoveryResult {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String accountId = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.fsck.k9.backend.jmap.JmapDiscoveryResult.JmapAccount copy(@org.jetbrains.annotations.NotNull
        java.lang.String accountId, @org.jetbrains.annotations.NotNull
        java.lang.String name) {
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
        
        public JmapAccount(@org.jetbrains.annotations.NotNull
        java.lang.String accountId, @org.jetbrains.annotations.NotNull
        java.lang.String name) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAccountId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
    }
}