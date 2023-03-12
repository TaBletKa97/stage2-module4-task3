package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

public class LexemeParser extends AbstractTextParser {
    private static final String LEXEME_REGEX = "\\s+";

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        char[] arr = string.toCharArray();
        AbstractTextComponent word = new TextComponent(TextComponentType.WORD);
        for (char ch : arr) {
            word.add(new SymbolLeaf(TextComponentType.WORD, ch));
        }
        abstractTextComponent.add(word);
    }
}
