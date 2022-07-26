package com.dlq.design.structural.composite;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-07-26 21:17
 */
public class Client {

    public static void main(String[] args) {
        // 从大到小创建对象
        // 先创建大学
        OrganizationComponent university = new University("清华大学", "中国顶级大学");

        //创建 学院
        OrganizationComponent computerCollege = new College("计算机学院", "计算机学院描述啊啊啊");
        OrganizationComponent infoEngineerCollege = new College("信息工程学院", "信息工程学院描述啊啊啊");

        // 创建 各个学院 下面的 系（专业）
        computerCollege.add(new Department("网络工程", "网络工程牛哔！！！"));
        computerCollege.add(new Department("计算机科学与技术", "计算机科学与技术牛哔！！！"));
        computerCollege.add(new Department("软件工程", "软件工程牛哔！！！"));

        //
        infoEngineerCollege.add(new Department("通信工程", "通信工程太难了！"));
        infoEngineerCollege.add(new Department("信息工程", "信息工程太简单了！"));

        // 将两个学院加入到学校中
        university.add(computerCollege);
        university.add(infoEngineerCollege);

        university.print();
        // 单独查看计算机学院下的系
        computerCollege.print();
    }
}
