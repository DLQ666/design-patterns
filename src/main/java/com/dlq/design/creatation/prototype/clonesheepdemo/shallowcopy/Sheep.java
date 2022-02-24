package com.dlq.design.creatation.prototype.clonesheepdemo.shallowcopy;

import lombok.Data;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-02-24 21:16
 */
@Data
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    private String address = "蒙古羊";

    public Sheep friend; // 是对象，克隆是会如何处理？

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // 克隆该示例，使用默认的clone方法来完成
    @Override
    public Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
