package com.dlq.design.creatation.factory.simplefactory.pizzastore.tradition.order;

import com.dlq.design.creatation.factory.simplefactory.pizzastore.tradition.pizza.CheesePizza;
import com.dlq.design.creatation.factory.simplefactory.pizzastore.tradition.pizza.GreekPizza;
import com.dlq.design.creatation.factory.simplefactory.pizzastore.tradition.pizza.PepperPizza;
import com.dlq.design.creatation.factory.simplefactory.pizzastore.tradition.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-02-26 19:05
 */
public class OrderPizza {

    // 构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType; // 订购披萨的类型
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            } else if (orderType.equals("pepper")) {
                pizza = new PepperPizza();
                pizza.setName("胡椒披萨");
            }else {
                break;
            }
            // 输出pizza 的制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    // 动态获取客户希望订购的Pizza种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(" input pizza 种类：");
            return strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
