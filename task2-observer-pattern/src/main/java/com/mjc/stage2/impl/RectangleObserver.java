package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver implements Observer {

    @Override
    public void handleEvent(RectangleEvent event) {
        Rectangle rect = event.getSource();
        RectangleValues values = new RectangleValues(
                rect.getSideA() * rect.getSideB(),
                2 * (rect.getSideA() + rect.getSideB()));
        RectangleWarehouse.getInstance().put(rect.getId(), values);
    }
}
