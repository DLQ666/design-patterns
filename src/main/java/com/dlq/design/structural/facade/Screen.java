package com.dlq.design.structural.facade;

/**
 *@program: design-patterns
 *@description: 屏幕
 *@author: Hasee
 *@create: 2022-07-27 22:36
 */
public class Screen {

    private static final Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up() {
        System.out.println(" Screen up ");
    }

    public void down() {
        System.out.println(" Screen down ");
    }

}
