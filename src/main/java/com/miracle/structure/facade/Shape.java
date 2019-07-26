package com.miracle.structure.facade;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-26 09:42
 **/


/**
 * 意图：为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用
 *
 * 主要解决：降低访问复杂系统的内部子系统时的复杂度，简化客户端与之的接口
 *
 * 关键代码：在客户端与复杂系统之间再加一层，这一层将调用顺序、依赖关系等处理好
 */
public interface Shape {
    void draw();
}
