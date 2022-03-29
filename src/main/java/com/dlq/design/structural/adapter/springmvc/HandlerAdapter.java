package com.dlq.design.structural.adapter.springmvc;

/**
 *@description: Adapter接口
 *@author: Hasee
 *@create: 2022-03-29 22:20
 */
public interface HandlerAdapter {

    boolean supports(Object handler);

    void handle(Object handler);
}

class HttpHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handle(Object handler) {
        ((HttpController)handler).doHttpHandler();
    }
}

class SimpleHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleHandlerAdapter);
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController) handler).doSimpleHandler();
    }
}

class AnnotationHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof AnnotationController);
    }

    @Override
    public void handle(Object handler) {
        ((AnnotationController) handler).doAnnotationHandler();
    }
}
