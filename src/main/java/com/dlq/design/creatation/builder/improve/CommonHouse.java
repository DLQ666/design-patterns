package com.dlq.design.creatation.builder.improve;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-03-01 22:54
 */
public class CommonHouse extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子屋顶");
    }
}
