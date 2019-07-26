package com.miracle.structure.proxy;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-26 10:02
 **/

/**
 * 意图：对其他对象提供一种代理以控制对这个对象的访问
 *
 * 何时使用：想在访问一个类时做一些控制
 *
 * 关键代码：实现与被代理类组合
 */
public interface Image {
    void display();
}
