package com.miracle.create.builder.itemimpl.drinkimpl;

import com.miracle.create.builder.itemimpl.ColdDrink;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-24 21:38
 **/


public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
