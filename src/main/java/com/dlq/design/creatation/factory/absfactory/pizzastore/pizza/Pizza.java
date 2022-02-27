package com.dlq.design.creatation.factory.absfactory.pizzastore.pizza;

/**
 *@program: design-patterns
 *@description: 将Pizza 类做成抽象
 *@author: Hasee
 *@create: 2022-02-27 15:12
 */
public abstract class Pizza {

    protected String name; // 名字

    // 准备原材料，不同的披萨不一样，因此，我们做成抽象方法
    public abstract void prepare();

    public void bake() {
        System.out.println(name + "烘焙-baking;");
    }

    public void cut() {
        System.out.println(name + "切割-cutting;");
    }

    // 打包
    public void box() {
        System.out.println(name + "打包-boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }

}
