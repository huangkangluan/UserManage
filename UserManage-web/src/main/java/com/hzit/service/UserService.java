package com.hzit.service;

import com.hzit.dao.entity.User;
import com.hzit.dao.vo.UserVo;

import java.util.List;


/**
 * Created by Administrator on 2016/10/14.
 */
public interface UserService {
    public User login(String userName,String password);
    public boolean insertUser(User user);
    public List<UserVo> findUser();
}
