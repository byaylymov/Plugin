package com.test.plugin;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class HostsSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey KEY =
            createTextAttributesKey("HOSTS_KEY", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey COMMENT =
            createTextAttributesKey("HOSTS_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new HostsLexer();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(HostsTypesForTokens.KEY)) {
            return new TextAttributesKey[]{KEY};
        }
        if (tokenType.equals(HostsTypesForTokens.COMMENT)) {
            return new TextAttributesKey[]{COMMENT};
        }
        return new TextAttributesKey[0];
    }
}
