package com.dlq.design.structural.adapter.springmvc;

/**
 *@description:
 *@author: Hasee
 *@create: 2022-03-29 22:16
 */
public interface Controller {
}

class HttpController implements Controller {

    public void doHttpHandler() {
        System.out.println("http.........");
    }
}

class SimpleController implements Controller {

    public void doSimpleHandler() {
        System.out.println("simple.........");
    }
}

class AnnotationController implements Controller {

    public void doAnnotationHandler() {
        System.out.println("annotation.........");
    }
}
