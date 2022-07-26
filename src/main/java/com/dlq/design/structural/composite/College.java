package com.dlq.design.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-07-26 21:11
 */
public class College extends OrganizationComponent{

    // List 中存放的是Department
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    // 构造器
    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        // 实际业务，College 的add方法 和 University 的不一定相同
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        // 实际业务，College 的remove方法 和 University 的不一定相同
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    // print方法，就是输出University包含的学院
    @Override
    protected void print() {
        System.out.println("-----------------" + getName() + "------------------");
        for (OrganizationComponent organizationComponent : organizationComponents) {
            organizationComponent.print();
        }
    }
}
