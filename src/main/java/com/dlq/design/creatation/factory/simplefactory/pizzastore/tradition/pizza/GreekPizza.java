package com.dlq.design.creatation.factory.simplefactory.pizzastore.tradition.pizza;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-02-26 19:03
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println(" 给希腊披萨 准备原材料 ");
    }
}
