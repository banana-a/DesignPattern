package com.miracle.action.interpreter;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-28 13:16
 **/

/**
 * 意图：给定一个语言，定义它的文法表示，并定义一个解释器，这个解释器来解释语言中的句子
 *
 * 何时使用：如果一个特定类型的问题发生的频率足够高，那么可能就值得将该问题的各个实例表述为一个简单语言中
 * 的句子。这样就可以构建一个解释器，该解释器通过解释这些句子来解决该问题
 *
 * 如何解决：构建语法树，定义终结符与非终结符
 *
 * 关键代码：构建环境类，包含解释器以外的一些全局信息，一般是HashMap
 */
public interface Expression {
    public boolean interpret(String context);

}
