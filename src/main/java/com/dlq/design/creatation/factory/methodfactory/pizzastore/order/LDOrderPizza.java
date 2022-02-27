package com.dlq.design.creatation.factory.methodfactory.pizzastore.order;

import com.dlq.design.creatation.factory.methodfactory.pizzastore.pizza.LDCheesePizza;
import com.dlq.design.creatation.factory.methodfactory.pizzastore.pizza.LDPepperPizza;
import com.dlq.design.creatation.factory.methodfactory.pizzastore.pizza.Pizza;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-02-27 15:33
 */
public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
