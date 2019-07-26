package com.miracle.create.builder;

import com.miracle.create.builder.itemimpl.burgerimpl.ChickenBurger;
import com.miracle.create.builder.itemimpl.burgerimpl.VegBurger;
import com.miracle.create.builder.itemimpl.drinkimpl.Coke;
import com.miracle.create.builder.itemimpl.drinkimpl.Pepsi;

/**
 * @program: DesignPattern
 * @description:
 * @author: miracle
 * @create: 2019-07-24 21:42
 **/


public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
