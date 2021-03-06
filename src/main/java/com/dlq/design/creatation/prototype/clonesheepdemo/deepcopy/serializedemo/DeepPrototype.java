package com.dlq.design.creatation.prototype.clonesheepdemo.deepcopy.serializedemo;

import java.io.*;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-02-24 22:58
 */
public class DeepPrototype implements Serializable, Cloneable {

    public String name; // String 属性
    public DeepCloneableTarget deepCloneableTarget; // 引用类型

    public DeepPrototype() {
    }

    // 深拷贝 - 方式2 通过对象的序列化实现（推荐）
    public Object deepClone() {
        // 创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //当前这个对象以对象流的方式输出

            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype copyObj = (DeepPrototype) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            // 关闭流
            try {
                if (bos != null){
                    bos.close();
                }
                if (oos != null){
                    oos.close();
                }
                if (bis != null){
                    bis.close();
                }
                if (ois != null){
                    ois.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
