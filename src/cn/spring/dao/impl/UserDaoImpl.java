package cn.spring.dao.impl;

import cn.spring.dao.UserDao;
import cn.spring.entity.User;

public class UserDaoImpl implements UserDao {

    @Override
    public void save(User user) {
        System.out.println("模拟保存信息到数据库");
    }
}
