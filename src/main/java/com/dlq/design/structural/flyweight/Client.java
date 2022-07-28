package com.dlq.design.structural.flyweight;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-07-28 22:17
 */
public class Client {

    public static void main(String[] args) {
        // 创建一个工厂类
        WebSiteFactory factory = new WebSiteFactory();

        // 客户要一个以新闻形式发布的网站
        WebSite webSite1 = factory.getWebSiteCategory("新闻");
        webSite1.use();

        // 客户要一个以博客形式发布的网站
        WebSite webSite2 = factory.getWebSiteCategory("博客");
        webSite2.use();

        // 客户又要一个以博客形式发布的网站
        WebSite webSite3 = factory.getWebSiteCategory("博客");
        webSite3.use();

        System.out.println("网站的分类共 = " + factory.getWebSiteCount());
    }
}
