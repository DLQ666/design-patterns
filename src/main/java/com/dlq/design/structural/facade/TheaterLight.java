package com.dlq.design.structural.facade;

/**
 *@program: design-patterns
 *@description: 灯光
 *@author: Hasee
 *@create: 2022-07-27 22:38
 */
public class TheaterLight {

    private static final TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" TheaterLight on ");
    }

    public void off() {
        System.out.println(" TheaterLight off ");
    }

    public void dim(){
        System.out.println(" TheaterLight dim ... ");
    }

    public void bright(){
        System.out.println(" TheaterLight bright ... ");
    }
}
