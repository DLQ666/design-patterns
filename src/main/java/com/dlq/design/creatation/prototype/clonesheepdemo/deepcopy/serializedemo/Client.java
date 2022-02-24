package com.dlq.design.creatation.prototype.clonesheepdemo.deepcopy.serializedemo;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-02-24 23:05
 */
public class Client {

    public static void main(String[] args) throws Exception {
        DeepPrototype p = new DeepPrototype();
        p.name = "哈哈哈2";
        p.deepCloneableTarget = new DeepCloneableTarget("方式二", "大佬啊啊啊啊");

        DeepPrototype p2 = (DeepPrototype) p.deepClone();

        System.out.println("p.name：" + p.name + p.name.hashCode() + " ======== " +
                "p.deepCloneableTarget：" + p.deepCloneableTarget.hashCode());
        System.out.println();
        System.out.println("p2.name：" + p2.name + p2.name.hashCode() + " ======== " +
                "p2.deepCloneableTarget：" + p2.deepCloneableTarget.hashCode());
    }
}
