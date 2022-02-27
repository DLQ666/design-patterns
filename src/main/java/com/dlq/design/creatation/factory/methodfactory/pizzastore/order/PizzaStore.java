package com.dlq.design.creatation.factory.methodfactory.pizzastore.order;

/**
 *@program: design-patterns
 *@description: 客户端
 *@author: Hasee
 *@create: 2022-02-27 15:37
 */
public class PizzaStore {

    public static void main(String[] args) {
        String local = "bj";
        if (local.equals("bj")) {
            // 创建北京口味的各种pizza
            new BJOrderPizza();
        } else if (local.equals("ld")) {
            // 创建伦敦口味的各种pizza
            new LDOrderPizza();
        }
    }
}
