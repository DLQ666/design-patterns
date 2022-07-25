package com.dlq.design.structural.decorator;

import lombok.Data;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-07-25 21:25
 */
@Data
public abstract class Drink {

    public String des;
    private float price = 0.0f;

    //计算费用的抽象方法
    //子类来实现
    public abstract float cost();
}
