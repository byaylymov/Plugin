package com.test.plugin;

import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class HostsSyntaxHighlighterDefinition extends SyntaxHighlighterFactory {
    @Override
    public com.intellij.openapi.fileTypes.@NotNull SyntaxHighlighter getSyntaxHighlighter(@Nullable Project project, @Nullable VirtualFile virtualFile) {
        return new HostsSyntaxHighlighter();
    }
}
