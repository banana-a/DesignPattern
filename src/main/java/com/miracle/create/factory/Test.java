package com.miracle.create.factory;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-05 14:57
 **/


public class Test {

    public static void main(String[] args) {

        ApiFactory factory = new ApiFactory();
        factory.getApi(1).sayHi();
        factory.getApi(2).sayHi();
        
    }

}
