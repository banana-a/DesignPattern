package com.miracle.action.chain;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-26 10:38
 **/

/**
 * 意图：避免请求发送者与接受者耦合在一起，，让多个多个对象都有可能接受请求，将这些对象连接成一条链，并且沿着
 * 这条链传递请求，知道有对象处理它为止
 *
 * 如何解决：拦截的类都实现统一接口
 *
 * 关键代码：Handler里面聚合它自己，在HandlerRequest里判断是否合适，如果没达到条件则向下传递
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //责任链中的下一个元素
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    //关键
    public void logMessage(int level, String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }
    abstract protected void write(String message);
}