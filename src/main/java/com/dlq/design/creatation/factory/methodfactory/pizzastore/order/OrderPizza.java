package com.dlq.design.creatation.factory.methodfactory.pizzastore.order;

import com.dlq.design.creatation.factory.methodfactory.pizzastore.pizza.Pizza;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *@program: design-patterns
 *@description: 充当一个工厂类
 *@author: Hasee
 *@create: 2022-02-27 15:26
 */
public abstract class OrderPizza {

    // 定义一个抽象的创建pizza的方法 createPizza ， 让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    // 构造器
    public OrderPizza() {
        Pizza pizza = null;
        String orderType; // 订购披萨的类型
        do {
            orderType = getType();
            pizza = createPizza(orderType);
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
