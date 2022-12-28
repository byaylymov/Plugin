package com.test.plugin;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class HostsErrorHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("HOSTS_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);
    public static final TextAttributesKey INVALID_ORDER = createTextAttributesKey("HOSTS_INVALID_ORDER", HighlighterColors.BAD_CHARACTER);

    @Override
    public @NotNull Lexer getHighlightingLexer() {
        return new HostsLexer();
    }

    @Override
    public TextAttributesKey @NotNull [] getTokenHighlights(IElementType tokenType) {
        if (tokenType.equals(HostsTypesForTokens.BAD_CHARACTER)) {
            return new TextAttributesKey[]{BAD_CHARACTER};
        }
        if (tokenType.equals(HostsTypesForTokens.INVALID_ORDER)) {
            return new TextAttributesKey[]{INVALID_ORDER};
        }
        return new TextAttributesKey[0];
    }
}
