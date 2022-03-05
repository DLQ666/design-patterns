package com.dlq.design.structural.adapter.interfaceadapter;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-03-05 23:24
 */
public class Client {

    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter() {
            // 只需要去覆盖我们 需要使用 接口方法
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };
        absAdapter.m1();

    }
}
