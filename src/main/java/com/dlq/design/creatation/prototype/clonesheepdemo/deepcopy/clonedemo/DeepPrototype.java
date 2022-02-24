package com.dlq.design.creatation.prototype.clonesheepdemo.deepcopy.clonedemo;

import java.io.Serializable;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-02-24 22:58
 */
public class DeepPrototype implements Serializable, Cloneable {

    public String name; // String 属性
    public DeepCloneableTarget deepCloneableTarget; // 引用类型

    public DeepPrototype() {
    }

    // 深拷贝 - 方式1 使用clone 方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 这里完成对基本数据类型（属性）和String的克隆
        deep = super.clone();
        // 对引用类型的属性，进行单独处理
        DeepPrototype deepPrototype = (DeepPrototype) deep;
        deepPrototype.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepPrototype;
    }
}
