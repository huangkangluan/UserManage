package com.hzit.service;

import com.hzit.dao.entity.Rolemodule;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/14.
 */
public interface RoleModuleService {
    public List<Rolemodule> findRoleModule(Map map);
}
