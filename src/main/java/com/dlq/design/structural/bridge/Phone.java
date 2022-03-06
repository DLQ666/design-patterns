package com.dlq.design.structural.bridge;

/**
 *@program: design-patterns
 *@description: 相当于桥接类
 *@author: Hasee
 *@create: 2022-03-06 22:43
 */
public abstract class Phone {

    // 组合品牌
    private Brand brand;

    // 构造器
    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.call();
    }
}
