package com.test.plugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import java.io.IOException;

public class TestLexer implements FlexLexer {
    private final java.io.Reader reader;

    TestLexer(java.io.Reader input) {
        this.reader = input;
    }

    @Override
    public void yybegin(int state) {

    }

    @Override
    public int yystate() {
        return 0;
    }

    @Override
    public int getTokenStart() {
        return 0;
    }

    @Override
    public int getTokenEnd() {
        return 0;
    }

    @Override
    public IElementType advance() throws IOException {
        return null;
    }

    @Override
    public void reset(CharSequence buf, int start, int end, int initialState) {

    }
}
