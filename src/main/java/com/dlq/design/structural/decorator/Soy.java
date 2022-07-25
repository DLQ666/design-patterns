package com.dlq.design.structural.decorator;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-07-25 21:57
 */
public class Soy extends Decorator{

    public Soy(Drink obj) {
        super(obj);
        setDes(" 豆浆 ");
        setPrice(1.5f);
    }
}
