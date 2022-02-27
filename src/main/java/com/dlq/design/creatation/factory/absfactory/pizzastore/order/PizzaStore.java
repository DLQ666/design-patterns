package com.dlq.design.creatation.factory.absfactory.pizzastore.order;

/**
 *@program: design-patterns
 *@description: 客户端
 *@author: Hasee
 *@create: 2022-02-27 17:45
 */
public class PizzaStore {

    public static void main(String[] args) {
        // new OrderPizza(new BJFactory());
         new OrderPizza(new LDFactory());
    }
}
