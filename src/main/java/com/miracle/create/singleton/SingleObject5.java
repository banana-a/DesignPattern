package com.miracle.create.singleton;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-24 21:22
 **/

/**
 * 内部类
 * 是否lazy初始化：是
 * 是否多线程安全：是
 */
public class SingleObject5 {
    public static class SingletonHolder{
        private static final SingleObject5 INSTANCE = new SingleObject5();
    }
    private SingleObject5(){}
    public static final SingleObject5 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
