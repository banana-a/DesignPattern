package com.miracle.create.builder.itemimpl.burgerimpl;

import com.miracle.create.builder.itemimpl.Burger;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-24 21:37
 **/


public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50f;
    }
}
