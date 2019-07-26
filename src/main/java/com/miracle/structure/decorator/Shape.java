package com.miracle.structure.decorator;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-26 09:26
 **/

/**
 * 意图：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰器模式相比生成子类更加灵活
 *
 * 何时使用：在不想增加很多子类的情况下扩展类
 *
 * 如何解决：将具体功能职责划分，同时继承装饰者模式
 */
public interface Shape {
    void draw();
}
