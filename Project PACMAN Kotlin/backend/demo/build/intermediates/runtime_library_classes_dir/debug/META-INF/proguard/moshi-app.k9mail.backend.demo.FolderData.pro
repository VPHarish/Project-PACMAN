-if class app.k9mail.backend.demo.FolderData
-keepnames class app.k9mail.backend.demo.FolderData
-if class app.k9mail.backend.demo.FolderData
-keep class app.k9mail.backend.demo.FolderDataJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
