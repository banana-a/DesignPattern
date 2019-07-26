package com.miracle.create.singleton;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-24 21:20
 **/

/**
 * 双检锁
 * 是否lazy初始化：是
 * 是否线程安全：是
 */
public class SingleObject4 {
    private volatile static SingleObject4 instance;
    private SingleObject4(){}
    public static SingleObject4 getInstance(){
        if (instance == null){
            synchronized (SingleObject4.class){
                if (instance == null){
                    instance = new SingleObject4();
                }
            }
        }
        return instance;
    }
}
