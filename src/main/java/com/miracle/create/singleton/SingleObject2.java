package com.miracle.create.singleton;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-24 21:16
 **/

/**
 * 懒汉式，线程安全
 * 是否lazy初始化：是
 * 是否线程安全：是
 */
public class SingleObject2 {
    private static SingleObject2 instance;
    private SingleObject2 (){}
    public static synchronized SingleObject2 getInstance(){
        if (instance == null){
            instance = new SingleObject2();
        }
        return instance;
    }
}
