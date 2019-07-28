package com.miracle.action.command;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-28 12:37
 **/


public class Stock {
    private String name = "ABC";
    private int quantity = 10;
    public void buy(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+",Quantity: " + quantity +" ] sold");
    }
}
