package com.dlq.design.creatation.singleton;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-02-20 22:26
 */
public class MainTest {

    public static void main(String[] args) {
        HungrySingleton2 instance = HungrySingleton2.INSTANCE;
        HungrySingleton2 instance2 = HungrySingleton2.INSTANCE;
        System.out.println(instance == instance2);
    }
}
