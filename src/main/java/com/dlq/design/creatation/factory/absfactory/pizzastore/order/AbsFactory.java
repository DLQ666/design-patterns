package com.dlq.design.creatation.factory.absfactory.pizzastore.order;

import com.dlq.design.creatation.factory.absfactory.pizzastore.pizza.Pizza;

/**
 *@description: 一个抽象工厂模式的抽象层（接口）
 *@author: Hasee
 *@create: 2022-02-27 17:25
 */
public interface AbsFactory {

    // 让下面的工厂子类来 具体实现
    Pizza createPizza(String orderType);
}
