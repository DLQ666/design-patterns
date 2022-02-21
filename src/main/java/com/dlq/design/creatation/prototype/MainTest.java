package com.dlq.design.creatation.prototype;

/**
 *@program: design-patterns
 *@description: 原型模式
 *@author: Hasee
 *@create: 2022-02-20 22:26
 *
 * 是用于创建重复对象，同时又能保证性能
 * 1、MyBatis：操作数据库，从数据库里面查出很多记录（70%改变很少）
 * 2、每次查询数据库，查到以后把所有对象都封装为一个对象，返回。
 *          10000 thread：查询一个记录，new User("zhangsan",19)；每次创建一个对象封装并返回。
 *          系统里面就会有10000个 User，浪费内存
 * 3、解决：缓存：查过的保存。
 *              如果再查相同的记录，拿到原来的原型对象
 */
public class MainTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        DLQMyBatis dlqMyBatis = new DLQMyBatis();
        User zhangsan1 = dlqMyBatis.getUser("zhangsan");
        System.out.println("1==>" + zhangsan1);
        zhangsan1.setUsername("李四。。。。。。。");
        System.out.println("zhangsan1自己改了：" + zhangsan1);

        User zhangsan2 = dlqMyBatis.getUser("zhangsan");
        System.out.println("2==>" + zhangsan2);

        User zhangsan3 = dlqMyBatis.getUser("zhangsan");
        System.out.println("3==>" + zhangsan3);

        User zhangsan4 = dlqMyBatis.getUser("zhangsan");
        System.out.println("4==>" + zhangsan4);

        System.out.println(zhangsan1 == zhangsan3);

    }
}
