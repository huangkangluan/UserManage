package com.hzit.service.impl;

import com.hzit.dao.entity.Role;
import com.hzit.dao.mapper.RoleMapper;
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
    public List<Role> findAll() {
        return roleMapper.searchRoleByParams(null);
    }

    @Override
    public List<Role> findRole(Map map) {

        return roleMapper.searchRoleByParams(map);
    }

    @Override
    public boolean insertRole(Role role) {
        try{
            roleMapper.insertRole(role);
            return true;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return false;
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
