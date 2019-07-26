package com.miracle.structure.facade.shapeimpl;

import com.miracle.structure.facade.Shape;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-26 09:45
 **/


public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}