package com.ljl.dao;

import com.ljl.domain.User;

import java.util.List;

public interface IUserDao {
    /**
     * 查询所有人员
     * @return
     */
    List<User> findAll();

    public void insertOne(User user);

}
