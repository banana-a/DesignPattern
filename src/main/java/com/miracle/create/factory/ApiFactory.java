package com.miracle.create.factory;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-05 14:56
 **/


public class ApiFactory {

    public Api getApi(int choose){
        if (choose == 1) return new Impl1();
        if (choose == 2) return new Impl2();
        return null;
    }

}
