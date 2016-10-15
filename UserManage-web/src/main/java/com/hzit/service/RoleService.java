package com.hzit.service;

import com.hzit.dao.entity.Role;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/13.
 */
public interface RoleService {
    public List<Role> findAll();
    public List<Role> findRole(Map map);
    public boolean insertRole(Role role);
    public int updateRole(Role role);
    public int deleteRole(int roleId);
}
