package com.test.plugin;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;

public interface HostsTypesForTokens {
    IElementType KEY = new HostsTokenType("KEY");
    IElementType COMMENT = new HostsTokenType("COMMENT");
    IElementType BAD_CHARACTER = new HostsTokenType("BAD_CHARACTER");
    IElementType INVALID_ORDER = new HostsTokenType("INVALID_ORDER");
    class Creator {
        public static PsiElement createElement(ASTNode node) {
            IElementType type = node.getElementType();
            if (type == KEY || type == COMMENT) {
                throw new AssertionError("Unknown element type: " + type);
            }
            return (PsiElement) new HostsTestProperty(node);
        }
    }
}
