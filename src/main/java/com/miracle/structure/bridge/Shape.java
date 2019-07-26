package com.miracle.structure.bridge;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-26 08:52
 **/


public abstract class Shape {
    protected DrawApi drawApi;
    protected Shape(DrawApi drawApi){
        this.drawApi = drawApi;
    }
    public abstract void draw();
}
