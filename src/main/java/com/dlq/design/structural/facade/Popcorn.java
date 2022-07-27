package com.dlq.design.structural.facade;

/**
 *@program: design-patterns
 *@description: 爆米花机
 *@author: Hasee
 *@create: 2022-07-27 22:32
 */
public class Popcorn {

    private static final Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" popcorn on ");
    }

    public void off() {
        System.out.println(" popcorn ff ");
    }

    public void pop() {
        System.out.println(" popcorn is popong ");
    }
}
