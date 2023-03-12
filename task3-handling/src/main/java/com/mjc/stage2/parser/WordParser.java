package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordParser extends AbstractTextParser {
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        if (nextParser != null) {
            Pattern pattern = Pattern.compile(WORD_REGEX);
            Matcher matcher = pattern.matcher(string);
            int startPos = 0;
            while (matcher.find(startPos)) {
                String word = matcher.group();
                startPos = matcher.end();
                nextParser.parse(abstractTextComponent, word);
            }
        }
    }
}
