package com.dlq.design.creatation.singleton;

/**
 *@program: design-patterns
 *@description: 懒汉式单例 - 线程安全 - 同步方法
 *@author: Hasee
 *@create: 2022-02-25 20:43
 */
public class LazySingletonSafeSync {

    public static LazySingletonSafeSync instance = null;

    private LazySingletonSafeSync() {
    }

    public static synchronized LazySingletonSafeSync getInstance(){
        if (instance == null) {
            instance = new LazySingletonSafeSync();
        }
        return instance;
    }
}
