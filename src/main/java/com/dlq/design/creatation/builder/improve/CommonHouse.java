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
        house.setBasic("地基5米");
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        house.setWall("砌墙10cm");
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        house.setRoofed("普通屋顶");
        System.out.println("普通房子屋顶");
    }
}
