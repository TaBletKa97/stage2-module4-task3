package com.mjc.stage2.entity;

import com.mjc.stage2.exception.HandlingException;

public class SymbolLeaf extends AbstractTextComponent {

    private char value;

    public SymbolLeaf(TextComponentType componentType, char value) {
        super(componentType);
        this.value = value;
    }

    @Override
    public String operation() {
        return String.valueOf(value);
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        throw new HandlingException();
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        throw new HandlingException();
    }

    @Override
    public int getSize() {
        return 1;
    }
}
