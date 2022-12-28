package com.test.plugin;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;

public class HostsTestFile extends PsiFileBase {
    protected HostsTestFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, HostsLanguage.INSTANCE);
    }

    @Override
    public @NotNull FileType getFileType() {
        return HostsFileType.INSTANCE;
    }
}
