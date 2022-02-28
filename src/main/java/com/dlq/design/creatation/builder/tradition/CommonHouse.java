package com.dlq.design.creatation.builder.tradition;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-02-28 22:23
 */
public class CommonHouse extends AbstractHouse {

    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基！");
    }

    @Override
    public void buildWalls() {
        System.out.println("给普通房子砌墙！");
    }

    @Override
    public void roofed() {
        System.out.println("给普通房子封顶！");
    }
}
