package com.test.plugin;

import com.intellij.lexer.FlexAdapter;

public class HostsLexer extends FlexAdapter {
    public HostsLexer() {
        super(new TestLexer(null));
    }
}
