package com.hzit.service.impl;

import com.hzit.dao.entity.User;
import com.hzit.dao.mapper.UserMapper;
import com.hzit.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */
@Service
public class LoginServiceImpl implements LoginService {
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
}
