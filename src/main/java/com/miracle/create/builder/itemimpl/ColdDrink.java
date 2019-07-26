package com.miracle.create.builder.itemimpl;

import com.miracle.create.builder.Item;
import com.miracle.create.builder.Packing;
import com.miracle.create.builder.packingimpl.Bottle;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-24 21:34
 **/


public abstract class ColdDrink implements Item {
    @Override
    public Packing packing(){
        return new Bottle();
    }
    @Override
    public abstract float price();
}
