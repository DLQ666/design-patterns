package com.dlq.design.structural.decorator;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-07-25 21:59
 */
public class CoffeeBar {

    public static void main(String[] args) {
        // 装饰者模式下的订单： 2份巧克力+一份牛奶的LongBlack

        // 1、点一份 LongBlack
        Drink order = new LongBlack();
        System.out.println("费用1= " + order.cost());
        System.out.println("描述= " + order.getDes());

        // 2、order 加一分牛奶
        order = new Milk(order);
        System.out.println("order 加一分牛奶 费用 = " + order.cost());
        System.out.println("order 加一分牛奶 描述 = " + order.getDes());

        // 3、order 加一分巧克力
        order = new Chocolate(order);
        System.out.println("order 加一分牛奶 加一分巧克力 费用 = " + order.cost());
        System.out.println("order 加一分牛奶 加一分巧克力 描述 = " + order.getDes());

        // 4、order 加一分巧克力
        order = new Chocolate(order);
        System.out.println("order 加一分牛奶 加2份巧克力 费用 = " + order.cost());
        System.out.println("order 加一分牛奶 加2份巧克力 描述 = " + order.getDes());
    }
}
