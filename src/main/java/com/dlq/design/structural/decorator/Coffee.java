package com.dlq.design.structural.decorator;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-07-25 21:33
 */
public class Coffee extends Drink{

    @Override
    public float cost() {
        return super.getPrice();
    }
}
