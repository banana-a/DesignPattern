package com.miracle.create.builder;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-24 21:26
 **/

/**
 * 建造者模式
 *
 * 意图：将一个复杂的构建与其表示相分离，使得同样的构建工作可以创建不同的表示
 *
 * 主要解决：在软件系统中，有时候面临着“一个复杂对象”的创建工作，其通常由各个部分的子对象用一定的算法构成
 * 由于需求的变化，这个复杂对象的各个部分经常面临这剧烈的变化，但是将它们组合在一起的算法却相对稳定
 *
 * 何时使用：一些基本部件不会变，而其组合经常变化的时候
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
