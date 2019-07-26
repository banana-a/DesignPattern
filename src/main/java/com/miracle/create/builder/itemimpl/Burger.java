package com.miracle.create.builder.itemimpl;

import com.miracle.create.builder.Item;
import com.miracle.create.builder.Packing;
import com.miracle.create.builder.packingimpl.Wrapper;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-24 21:32
 **/


public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
