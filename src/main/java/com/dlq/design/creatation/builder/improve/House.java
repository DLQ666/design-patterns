package com.dlq.design.creatation.builder.improve;

/**
 *@program: design-patterns
 *@description: 产品-->Product
 *@author: Hasee
 *@create: 2022-03-01 22:43
 */
public class House {

    private String basic;
    private String wall;
    private String roofed;

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
