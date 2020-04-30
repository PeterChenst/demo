package com.example.springbootjdbc.dao.impl;

import com.example.springbootjdbc.dao.UsersDao;
import com.example.springbootjdbc.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UsersDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加用户
    @Override
    public void insertUsers(Users users){
        String sql = "insert into users(username,usersex) values(?,?) ";
        this.jdbcTemplate.update(sql,users.getUsername(),users.getUsersex());
    }

}
