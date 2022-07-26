package com.dlq.design.structural.composite;

import lombok.Data;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-07-26 20:57
 */
@Data
public abstract class OrganizationComponent {

    private String name; // 名字
    private String des; // 说明

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    protected void add(OrganizationComponent organizationComponent) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent) {
        // 默认实现
        throw new UnsupportedOperationException();
    }

    // 方法print，做成抽象的,子类都需要实现
    protected abstract void print();
}
