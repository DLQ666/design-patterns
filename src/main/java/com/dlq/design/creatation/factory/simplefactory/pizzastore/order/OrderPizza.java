package com.dlq.design.creatation.factory.simplefactory.pizzastore.order;

import com.dlq.design.creatation.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.dlq.design.creatation.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.dlq.design.creatation.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.dlq.design.creatation.factory.simplefactory.pizzastore.pizza.Pizza;

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

    // 定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    // 构造器
    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String orderType = ""; // 用户输入的

        this.simpleFactory = simpleFactory; // 设置简单工厂对象

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            // 输出pizza
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购披萨失败");
                break;
            }
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
