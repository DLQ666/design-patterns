package com.dlq.design.structural.composite;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-07-26 21:14
 */
public class Department extends OrganizationComponent {

    // 没有集合

    public Department(String name, String des) {
        super(name, des);
    }

    // add 和 remove 方法就不用重写了，因为他是叶子节点

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
