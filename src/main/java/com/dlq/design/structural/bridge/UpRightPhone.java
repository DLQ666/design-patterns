package com.dlq.design.structural.bridge;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-03-06 22:56
 */
public class UpRightPhone extends Phone{

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("直立样式手机");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("直立样式手机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("直立样式手机");
    }
}
