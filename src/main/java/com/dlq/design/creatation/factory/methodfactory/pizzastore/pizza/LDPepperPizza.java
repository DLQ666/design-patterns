package com.dlq.design.creatation.factory.methodfactory.pizzastore.pizza;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-02-27 15:16
 */
public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦的胡椒pizza");
        System.out.println(" 给北京的伦敦pizza 准备原材料 ");
    }
}
