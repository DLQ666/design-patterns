package com.dlq.design.structural.adapter.classadapter;

/**
 *@program: design-patterns
 *@description: 适配器类
 *@author: Hasee
 *@create: 2022-03-02 23:18
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        // 获取到220V的电压
        int srcV = output220V();
        int dstV = srcV / 44; // 转成5V
        return dstV;
    }
}
