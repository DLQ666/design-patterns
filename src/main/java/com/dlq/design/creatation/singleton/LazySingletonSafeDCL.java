package com.dlq.design.creatation.singleton;

/**
 *@program: design-patterns
 *@description: 懒汉式单例 - 线程安全 - Double Check Lock DCL双重检查
 *@author: Hasee
 *@create: 2022-02-20 22:55
 */
public class LazySingletonSafeDCL {

    private static volatile LazySingletonSafeDCL instance = null;

    private LazySingletonSafeDCL() {
    }

    // 1、public static synchronized LazySingletonSafeDCL getInstance() {...} 锁太大
    // 2、双重检查锁 + 内存可见性volatile关键字
    public static LazySingletonSafeDCL getInstance() {
        if (instance == null) {
            synchronized (LazySingletonSafeDCL.class) {
                if (instance == null) {
                    instance = new LazySingletonSafeDCL();
                }
            }
        }
        return instance;
    }
}
