package com.dlq.design.creatation.factory.methodfactory.pizzastore.pizza;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-02-27 15:14
 */
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京的奶酪pizza");
        System.out.println(" 给北京的奶酪pizza 准备原材料 ");
    }
}
