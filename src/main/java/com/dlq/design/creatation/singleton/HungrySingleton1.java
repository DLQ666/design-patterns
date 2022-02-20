package com.dlq.design.creatation.singleton;

/**
 *@program: design-patterns
 *@description: 饿汉式单例 - 直接实例化
 *@author: Hasee
 *@create: 2022-02-20 22:28
 *
 * （1）构造器私有化
 * （2）自行创建，并且用静态变量保存
 * （3）向外提供这个实例
 * （4）强调这是一个单例，我们可以用final修改
 */
public class HungrySingleton1 {

    // 不能存在线程安全问题
    public static final HungrySingleton1 INSTANCE = new HungrySingleton1();

    // 构造器私有化
    private HungrySingleton1() {
    }

    /*// 或者==========================================
    private static final HungrySingleton1 INSTANCE = new HungrySingleton1();

    // 构造器私有化
    private HungrySingleton1() {
    }

    public static HungrySingleton1 getInstance() {
        return INSTANCE;
    }*/
}
