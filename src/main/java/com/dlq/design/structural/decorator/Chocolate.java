package com.dlq.design.structural.decorator;

/**
 *@program: design-patterns
 *@description: 具体的Decorator，这里就是调味品
 *@author: Hasee
 *@create: 2022-07-25 21:51
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink obj) {
        super(obj);
        setDes(" 巧克力 ");
        setPrice(3.0f); // 当前 调味品 的价格
    }

}
