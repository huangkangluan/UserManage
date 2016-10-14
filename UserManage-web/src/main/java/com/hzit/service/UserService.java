package com.hzit.service;

import com.hzit.dao.entity.User;


/**
 * Created by Administrator on 2016/10/14.
 */
public interface UserService {
    public User login(String userName,String password);
}
