package com.dlq.design.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *@program: design-patterns
 *@description: 网站工厂类，根据需要返回一个网站
 *@author: Hasee
 *@create: 2022-07-28 22:10
 */
public class WebSiteFactory {

    // 集合，充当池的作用
    private Map<String, ConcreteWebSite> pool = new HashMap<>();

    // 根据网站的类型，返回一个网站，如果没有就创建一个网站，并放入池中，并返回
    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            // 如果没有就创建一个网站，并放入池中
            pool.put(type, new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    // 获取网站分类的总数
    public int getWebSiteCount() {
        return pool.size();
    }
}
