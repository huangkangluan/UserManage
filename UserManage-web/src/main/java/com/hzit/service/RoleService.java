package com.hzit.service;

import com.hzit.dao.entity.Role;
import com.hzit.dao.vo.RoleVo;

import java.util.List;

/**
 * Created by Administrator on 2016/10/13.
 */
public interface RoleService {
    public List<RoleVo> findRole(Integer userId);
    public int insertRole(Role role);
    public int updateRole(Role role);
    public int deleteRole(int roleId);
}
