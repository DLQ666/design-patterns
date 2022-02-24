package com.dlq.design.creatation.prototype.clonesheepdemo.deepcopy.clonedemo;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-02-24 23:05
 */
public class Client {

    public static void main(String[] args) throws Exception {
        DeepPrototype p = new DeepPrototype();
        p.name = "哈哈哈";
        p.deepCloneableTarget = new DeepCloneableTarget("大神", "大佬啊啊啊啊");

        DeepPrototype p2 = (DeepPrototype) p.clone();

        System.out.println("p.name：" + p.name + p.name.hashCode() + " ======== " +
                "p.deepCloneableTarget：" + p.deepCloneableTarget.hashCode());
        System.out.println();
        System.out.println("p2.name：" + p2.name + p2.name.hashCode() + " ======== " +
                "p2.deepCloneableTarget：" + p2.deepCloneableTarget.hashCode());
    }
}
