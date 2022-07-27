package com.dlq.design.structural.facade;

/**
 *@program: design-patterns
 *@description: 投影仪
 *@author: Hasee
 *@create: 2022-07-27 22:34
 */
public class Projector {

    private static final Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Projector on ");
    }

    public void off() {
        System.out.println(" Projector ff ");
    }

    public void focus() {
        System.out.println(" Projector is focus ");
    }
}
