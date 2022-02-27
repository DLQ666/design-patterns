package com.dlq.design.creatation.factory.methodfactory.pizzastore.order;

import com.dlq.design.creatation.factory.methodfactory.pizzastore.pizza.BJCheesePizza;
import com.dlq.design.creatation.factory.methodfactory.pizzastore.pizza.BJPepperPizza;
import com.dlq.design.creatation.factory.methodfactory.pizzastore.pizza.Pizza;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-02-27 15:32
 */
public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
