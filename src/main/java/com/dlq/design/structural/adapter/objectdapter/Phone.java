package com.dlq.design.structural.adapter.objectdapter;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-03-02 23:21
 */
public class Phone {

    // 充电
    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V，可以充电~~");
        }else if (iVoltage5V.output5V() > 5){
            System.out.println("电压大于5V，不能充电~~");
        }
    }
}
