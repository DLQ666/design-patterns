package com.dlq.design.structural.adapter.objectdapter;

/**
 *@program: design-patterns
 *@description: 被适配的类
 *@author: Hasee
 *@create: 2022-03-02 23:15
 */
public class Voltage220V {

    // 输出220V的电压
    public int output220V() {
        int src = 220;
        System.out.println("电压=" + src + "伏");
        return src;
    }

}
