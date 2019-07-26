package com.miracle.create.builder.itemimpl.drinkimpl;

import com.miracle.create.builder.itemimpl.ColdDrink;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-24 21:38
 **/


public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
