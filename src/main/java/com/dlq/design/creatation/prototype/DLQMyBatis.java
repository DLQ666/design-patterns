package com.dlq.design.creatation.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 *@program: design-patterns
 *@description:
 *@author: Hasee
 *@create: 2022-02-21 23:35
 */
public class DLQMyBatis {

    private Map<String, User> userCatch = new HashMap<>();

    /**
     * 从数据库查数据
     * @return
     */
    public User getUser(String username) throws CloneNotSupportedException {
        User user = null;
        // 查询缓存中没有
        if (!userCatch.containsKey(username)) {
            // 查询数据库
            user = getUserFromDb(username);
        } else {
            // 从缓存中直接拿，脏缓存问题
            // 原型已经拿到，但是不能直接给。（本人）
            user = userCatch.get(username);
            System.out.println("从缓存中拿到的是" + user);
            // 从这个对象快速得到一个克隆体（克隆人） == 原型模式
            user = (User) user.clone();
        }
        return user;
    }

    private User getUserFromDb(String username) throws CloneNotSupportedException {
        System.out.println("从数据库查询到：" + username + "并且创建了对象！");
        User user = new User();
        user.setUsername(username);
        user.setAge(18);
        // 给缓存中放一个clone
        userCatch.put(username, (User) user.clone());
        return user;
    }
}
