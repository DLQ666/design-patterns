package com.dlq.design.structural.facade;

/**
 *@program: design-patterns
 *@description: DVD
 *@author: Hasee
 *@create: 2022-07-27 22:28
 */
public class DVDPlayer {

    // 使用单例模式，使用饿汉式
    private static final DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on(){
        System.out.println(" dvd on ");
    }

    public void off(){
        System.out.println(" dvd off ");
    }

    public void play(){
        System.out.println(" dvd is playing");
    }

    //....
    public void pause(){
        System.out.println(" dvd pause .. ");
    }
}
