package com.test.plugin;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class HostsTokenType extends IElementType {
    public HostsTokenType(@NonNls @NotNull String debugName) {
        super(debugName, HostsLanguage.INSTANCE);
    }
}
