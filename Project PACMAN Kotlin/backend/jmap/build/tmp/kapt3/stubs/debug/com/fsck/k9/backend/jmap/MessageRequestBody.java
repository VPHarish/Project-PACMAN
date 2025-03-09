package com.fsck.k9.backend.jmap;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/fsck/k9/backend/jmap/MessageRequestBody;", "Lokhttp3/RequestBody;", "message", "Lcom/fsck/k9/mail/Message;", "(Lcom/fsck/k9/mail/Message;)V", "contentLength", "", "contentType", "Lokhttp3/MediaType;", "writeTo", "", "sink", "Lokio/BufferedSink;", "jmap_debug"})
final class MessageRequestBody extends okhttp3.RequestBody {
    private final com.fsck.k9.mail.Message message = null;
    
    public MessageRequestBody(@org.jetbrains.annotations.NotNull
    com.fsck.k9.mail.Message message) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public okhttp3.MediaType contentType() {
        return null;
    }
    
    @java.lang.Override
    public long contentLength() {
        return 0L;
    }
    
    @java.lang.Override
    public void writeTo(@org.jetbrains.annotations.NotNull
    okio.BufferedSink sink) {
    }
}