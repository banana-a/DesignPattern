package com.miracle.structure.bridge;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-26 08:45
 **/

/**
 * 意图：将抽象部分与实现部分分离，使它们都可以独立的变化
 *
 * 主要解决：在有多种可能变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活
 *
 * 何时使用：实现系统可能有多个角度分类，每一种角度都可能变化
 *
 * 如何解决：把这种多角度分类分离出来，让它们独立变化，减少它们之间的耦合
 *
 * 关键代码：抽象类依赖实现类
 */
public interface DrawApi {
    public void drawCircle(int radius,int x,int y);
}
