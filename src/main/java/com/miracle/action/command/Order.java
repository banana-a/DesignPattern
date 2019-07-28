package com.miracle.action.command;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-26 10:54
 **/

/**
 * 意图：将一个请求封装成一个对象，从而使你可以用不同的请求对客户进行参数化
 *
 * 主要解决：在软件系统中，行为请求者与行为实现者通常是一种紧耦合的关系，但某些场合，比如需要对行为进行记录、
 * 撤销或重做、事务等处理时，这种无法抵御变化的紧耦合的设计就不太合适
 *
 * 如何解决：通过调用者调用接收者执行命令，顺序：调用者→接受者→命令
 *
 * 关键代码：定义三个角色：received真正的命令执行对象、Command、invoker使用命令的入口
 */
public interface Order {
    public void execute();
}
