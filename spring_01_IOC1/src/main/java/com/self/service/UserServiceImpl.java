package com.self.service;

import com.self.dao.UserDao;
import com.self.dao.UserDaoOracleImpl;


public class UserServiceImpl implements UserService {

    private UserDao userDao;
//dynamic injection
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
