package com.test.plugin;

import com.intellij.psi.tree.TokenSet;

public interface HostsTokens {
    TokenSet IDENTIFIERS = TokenSet.create(HostsTypesForTokens.KEY);

    TokenSet COMMENTS = TokenSet.create(HostsTypesForTokens.COMMENT);

}
