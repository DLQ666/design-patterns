package com.dlq.design.structural.adapter.objectdapter;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-03-02 23:24
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(" === 对象适配器模式 === ");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
