package com.miracle.action.command;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-28 12:58
 **/


public class BuyStock implements Order{
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
