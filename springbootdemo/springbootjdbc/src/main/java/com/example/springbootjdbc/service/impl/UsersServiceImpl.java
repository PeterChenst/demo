package com.example.springbootjdbc.service.impl;

import com.example.springbootjdbc.dao.UsersDao;
import com.example.springbootjdbc.pojo.Users;
import com.example.springbootjdbc.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Override
    @Transactional
    public void addUser(Users users) {
        this.usersDao.insertUsers(users);
    }
}
