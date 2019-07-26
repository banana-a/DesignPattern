package com.miracle.structure.bridge.shapeimpl;

import com.miracle.structure.bridge.DrawApi;
import com.miracle.structure.bridge.Shape;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-26 08:54
 **/


public class Circle extends Shape {
    private int x, y, radius;

    //这里是关键
    public Circle(int x, int y, int radius, DrawApi drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawApi.drawCircle(radius,x,y);
    }
}