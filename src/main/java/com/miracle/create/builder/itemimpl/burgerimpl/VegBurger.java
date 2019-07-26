package com.miracle.create.builder.itemimpl.burgerimpl;

import com.miracle.create.builder.itemimpl.Burger;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-24 21:36
 **/


public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
