package com.dlq.design.structural.decorator;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-07-25 21:55
 */
public class Milk extends Decorator{

    public Milk(Drink obj) {
        super(obj);
        setDes(" 牛奶 ");
        setPrice(2.0f); // 当前 调味品 的价格
    }
}
