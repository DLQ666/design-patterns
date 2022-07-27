package com.dlq.design.structural.facade;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-07-27 22:48
 */
public class Client {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();

        System.out.println();
        homeTheaterFacade.pause();

        System.out.println();
        homeTheaterFacade.end();
    }
}
