package com.dlq.design.creatation.builder.improve;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-03-01 22:57
 */
public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        house.setBasic("地基100米");
        System.out.println("高楼的打地基100米");
    }

    @Override
    public void buildWalls() {
        house.setWall("砌墙20cm");
        System.out.println("高楼的砌墙20cm");
    }

    @Override
    public void roofed() {
        house.setRoofed("透明屋顶");
        System.out.println("高楼的透明屋顶");
    }
}
