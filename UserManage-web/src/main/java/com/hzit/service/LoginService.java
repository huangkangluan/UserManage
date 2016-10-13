package com.hzit.service;

import com.hzit.dao.entity.User;

/**
 * Created by Administrator on 2016/10/13.
 */
public interface LoginService {
    public User login(String userName,String password);
}
