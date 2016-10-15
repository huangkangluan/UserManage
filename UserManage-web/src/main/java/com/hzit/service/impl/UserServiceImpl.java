package com.hzit.service.impl;

import com.hzit.dao.entity.User;
import com.hzit.dao.mapper.UserMapper;
import com.hzit.dao.vo.UserVo;
import com.hzit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/14.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String userName, String password) {
        Map map=new HashMap();
        map.put("userName",userName);
        map.put("password",password);
        List<User> list=userMapper.searchUserByParams(map);
        if (list.size()==1){
            return list.get(0);
        }
        return null;
    }

    @Override
    public boolean insertUser(User user) {
        try{
            userMapper.insertUser(user);
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
        }
            return false;
    }

    @Override
    public List<UserVo> findUser() {
         List<UserVo> userList=userMapper.findUser(null);
        return userList;
    }
}
