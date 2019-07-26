package com.miracle.structure.decorator.shapeimpl;

import com.miracle.structure.decorator.Shape;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-26 09:30
 **/


public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}