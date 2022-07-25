package com.dlq.design.structural.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-07-25 22:26
 */
public class JdkIODecorator {

    public static void main(String[] args) throws Exception {

        // 说明
        // 1、InputStream 是抽象类，类似前面案例中的 Drink 被装饰者
        // 2、FileInputStream 是 InputStream 子类，类似我们前面的 单品咖啡 Espresso、LongBlack
        // 3、FilterInputStream 是 InputStream 子类：类似我们前面 的 Decorator 装饰者
        // 4、DataInputStream 是 FilterInputStream 子类，具体的装饰者，类似前面的 Milk、Soy等
        // 5、FilterInputStream 类中含有 protected volatile InputStream in; 即：含被装饰者
        // 6、分析得出在jdk中 的io体系中，就是使用装饰者模式

        DataInputStream dis = new DataInputStream(new FileInputStream("d:\\abc.txt"));
        System.out.println(dis.read());
        dis.close();
    }
}
