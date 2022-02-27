package com.dlq.design.creatation.factory.simplefactory.pizzastore.staticsimplefactory;

/**
 *@program: design-patterns
 *@description: 相当于一个客户端，发出订购
 *@author: Hasee
 *@create: 2022-02-26 21:25
 */
public class PizzaStore {

    public static void main(String[] args) {
        // 使用静态简单工厂模式
        new OrderPizza();
        System.out.println("~~退出了程序~~");
    }
}
