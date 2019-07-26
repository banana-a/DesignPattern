package com.miracle.create.singleton;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-24 21:18
 **/

/**
 * 饿汉式
 * 是否lazy初始化：否
 * 是否线程安全：是
 */
public class SingleObject3 {
    private static SingleObject3 instance = new SingleObject3();
    private SingleObject3(){}
    public static SingleObject3 getInstance(){
        return instance;
    }
}
