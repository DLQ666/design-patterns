package com.dlq.design.structural.bridge;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-03-06 22:41
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机开机！");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机！");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话！");
    }
}
