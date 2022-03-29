package com.dlq.design.structural.adapter.springmvc;

import java.util.ArrayList;
import java.util.List;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-03-29 22:32
 */
public class DispatchServlet {

    public static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public DispatchServlet() {
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
        handlerAdapters.add(new AnnotationHandlerAdapter());
    }

    public void doDispatch() {
        // 此处模拟SpringMVC从request取handler的对象
        // 适配器可以获取到希望的Controller
        // HttpController controller = new HttpController();
        // SimpleController controller = new SimpleController();
        AnnotationController controller = new AnnotationController();
        // 得到对应的适配器
        HandlerAdapter adapter = getHandler(controller);
        // 通过适配器执行对应的controller对应方法
        adapter.handle(controller);
    }

    public HandlerAdapter getHandler(Controller controller) {
        // 遍历：根据得到的controller(handler), 返回对应的适配器HandlerAdapter
        for (HandlerAdapter adapter : handlerAdapters) {
            if (adapter.supports(controller)) {
                return adapter;
            }
        }
        return null;
    }

}
