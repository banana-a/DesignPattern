package com.miracle.structure.facade;

import com.miracle.structure.facade.shapeimpl.Circle;
import com.miracle.structure.facade.shapeimpl.Rectangle;
import com.miracle.structure.facade.shapeimpl.Square;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-26 09:46
 **/


public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}