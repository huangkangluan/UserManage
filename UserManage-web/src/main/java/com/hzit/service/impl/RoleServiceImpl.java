package com.hzit.service.impl;

import com.hzit.dao.entity.Role;
import com.hzit.dao.mapper.RoleMapper;
import com.hzit.dao.vo.RoleVo;
import com.hzit.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */
@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public List<RoleVo> findRole(Integer userId) {
        Map map=new HashMap();
        map.put("userId",userId);
        return roleMapper.searchRoleByParams(map);
    }

    @Override
    public int insertRole(Role role) {
        return 0;
    }

    @Override
    public int updateRole(Role role) {
        return 0;
    }

    @Override
    public int deleteRole(int roleId) {
        return 0;
    }
}
