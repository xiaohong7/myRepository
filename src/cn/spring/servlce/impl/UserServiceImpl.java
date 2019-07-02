package cn.spring.servlce.impl;

import cn.spring.dao.UserDao;
import cn.spring.entity.User;
import cn.spring.servlce.UserService;

public class UserServiceImpl implements UserService {
    private UserDao dao;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void addUser(User user) {
        System.out.println("添加用户");

    }
}
