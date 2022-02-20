package com.dlq.design.creatation.singleton;

/**
 *@program: design-patterns
 *@description: 懒汉式单例 - 线程不安全
 *@author: Hasee
 *@create: 2022-02-20 22:30
 */
public class LazySingletonNoSafe {

    // 声明当前类对象，没有初始化
    // 此对象也必须声明为static的
    private static LazySingletonNoSafe instance = null;

    // 私有化类的构造器
    private LazySingletonNoSafe() {
    }

    // 声明public的、static的返回当前类对象的方法
    public static LazySingletonNoSafe getInstance() {
        if (instance == null) {
            instance = new LazySingletonNoSafe();
        }
        return instance;
    }

}
