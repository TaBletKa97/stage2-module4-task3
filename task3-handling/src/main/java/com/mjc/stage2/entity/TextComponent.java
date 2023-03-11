package com.mjc.stage2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TextComponent extends AbstractTextComponent {
    protected List<AbstractTextComponent> componentList;
    private int size;

    public TextComponent(TextComponentType componentType) {
        super(componentType);
        this.componentList = new ArrayList<>();
        size = 0;
    }

    //Return all components as String
    @Override
    public String operation() {
        return componentList.stream()
                .map(AbstractTextComponent::operation)
                .collect(Collectors.joining(""));
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        componentList.add(textComponent);
        size += textComponent.getSize();
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        componentList.remove(textComponent);
        size -= textComponent.getSize();
    }

    @Override
    public int getSize() {
        return size;
    }
}
