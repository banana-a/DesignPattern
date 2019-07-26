package com.miracle.structure.decorator;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-26 09:31
 **/


public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}