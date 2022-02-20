package com.dlq.design.creatation.singleton;

/**
 *@program: design-patterns
 *@description: 懒汉式单例 - 线程安全 - 内部类方式
 *@author: Hasee
 *@create: 2022-02-20 23:02
 *
 *  在内部类被加载和初始化时，才创建INSTANCE实例对象
 *  静态内部类 不会自动随着外部类的加载和初始化而初始化，它是要单独去加载和初始化的。
 *  因为是在内部类加载和初始化时，创建的，因此是线程安全的。
 */
public class LazySingletonSafeInnerClass {

    private LazySingletonSafeInnerClass() {
    }

    private static class Inner {
        private static final LazySingletonSafeInnerClass INSTANCE = new LazySingletonSafeInnerClass();
    }

    public static LazySingletonSafeInnerClass getInstance() {
        return Inner.INSTANCE;
    }

}
