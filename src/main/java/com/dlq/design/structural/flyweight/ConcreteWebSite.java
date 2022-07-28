package com.dlq.design.structural.flyweight;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-07-28 22:08
 */
public class ConcreteWebSite extends WebSite {

    // 共享的部分，内部状态
    private String type = "";

    // 构造器
    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use() {
        System.out.println(" 网站的发布形式为：" + type + "在使用中... ");
    }
}
