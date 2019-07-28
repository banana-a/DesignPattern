package com.miracle.action.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-28 13:03
 **/


public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList){
            order.execute();
        }
        orderList.clear();
    }
}
