package com.dlq.design.creatation.factory.simplefactory.pizzastore.order;

import com.dlq.design.creatation.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.dlq.design.creatation.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.dlq.design.creatation.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.dlq.design.creatation.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 *@program: design-patterns
 *@description: 简单工厂类
 *@author: Hasee
 *@create: 2022-02-26 22:12
 */
public class SimpleFactory {

    // 根据orderType返回对应的Pizza对象
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
