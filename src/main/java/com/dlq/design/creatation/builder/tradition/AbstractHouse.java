package com.dlq.design.creatation.builder.tradition;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-02-28 22:20
 */
public abstract class AbstractHouse {

    // 打地基
    public abstract void buildBasic();
    // 砌墙
    public abstract void buildWalls();
    // 封顶
    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
