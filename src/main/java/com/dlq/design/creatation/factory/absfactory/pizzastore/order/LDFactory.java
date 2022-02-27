package com.dlq.design.creatation.factory.absfactory.pizzastore.order;

import com.dlq.design.creatation.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.dlq.design.creatation.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import com.dlq.design.creatation.factory.absfactory.pizzastore.pizza.Pizza;

/**
 *@program: design-patterns
 *@description: 这是工厂子类
 *@author: Hasee
 *@create: 2022-02-27 17:28
 */
public class LDFactory implements AbsFactory {

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }

}
