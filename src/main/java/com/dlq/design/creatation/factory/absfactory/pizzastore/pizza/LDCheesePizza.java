package com.dlq.design.creatation.factory.absfactory.pizzastore.pizza;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-02-27 15:16
 */
public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("伦敦的奶酪pizza");
        System.out.println(" 给伦敦的奶酪pizza 准备原材料 ");
    }
}
