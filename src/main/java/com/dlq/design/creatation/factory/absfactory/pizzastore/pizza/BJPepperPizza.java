package com.dlq.design.creatation.factory.absfactory.pizzastore.pizza;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-02-27 15:15
 */
public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京的胡椒pizza");
        System.out.println(" 给北京的胡椒pizza 准备原材料 ");
    }
}
