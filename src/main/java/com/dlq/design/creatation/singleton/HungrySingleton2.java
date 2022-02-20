package com.dlq.design.creatation.singleton;

/**
 *@program: design-patterns
 *@description: 饿汉式单例 - 静态代码块
 *@author: Hasee
 *@create: 2022-02-20 22:33
 */
public class HungrySingleton2 {

    public static final HungrySingleton2 INSTANCE;

    static {
        INSTANCE = new HungrySingleton2();
    }

    private HungrySingleton2() {
    }
}
