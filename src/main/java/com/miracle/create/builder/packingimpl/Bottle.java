package com.miracle.create.builder.packingimpl;

import com.miracle.create.builder.Packing;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-24 21:31
 **/


public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
