package com.dlq.design.creatation.factory.simplefactory.pizzastore.order;

import com.dlq.design.creatation.factory.simplefactory.pizzastore.order.OrderPizza;

/**
 *@program: design-patterns
 *@description: 相当于一个客户端，发出订购
 *@author: Hasee
 *@create: 2022-02-26 21:25
 */
public class PizzaStore {

    public static void main(String[] args) {
        // 使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("~~退出了程序~~");
    }
}
