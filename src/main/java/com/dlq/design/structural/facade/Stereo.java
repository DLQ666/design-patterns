package com.dlq.design.structural.facade;

/**
 *@program: design-patterns
 *@description: 立体声
 *@author: Hasee
 *@create: 2022-07-27 22:36
 */
public class Stereo {

    private static final Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" Stereo on ");
    }

    public void off() {
        System.out.println(" Stereo off ");
    }

    public void up(){
        System.out.println(" Stereo up ... ");
    }

}
