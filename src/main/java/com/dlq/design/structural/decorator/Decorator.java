package com.dlq.design.structural.decorator;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-07-25 21:39
 */
public class Decorator extends Drink {

    private final Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        // getPrice 调料自己的价格
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        // obj.getDes() 输出了被装饰者的信息
        return des + " " + getPrice() + " && " + obj.getDes();
    }
}
