package com.hzit.service.impl;

import com.hzit.dao.entity.Rolemodule;
import com.hzit.dao.mapper.RolemoduleMapper;
import com.hzit.service.RoleModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/14.
 */
@Service
public class RoleModuleServiceImpl implements RoleModuleService{
    @Autowired
    private RolemoduleMapper rolemoduleMapper;
    @Override
    public List<Rolemodule> findRoleModule(Map map) {
        return rolemoduleMapper.searchRolemoduleByParams(map);

    }
}
