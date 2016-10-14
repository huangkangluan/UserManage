package com.hzit.service.impl;

import com.hzit.dao.entity.Module;
import com.hzit.dao.mapper.ModuleMapper;
import com.hzit.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/14.
 */
@Service
public class ModuleServiceImpl implements ModuleService{
    @Autowired
    private ModuleMapper moduleMapper;
    @Override
    public List<Module> findModule(Map map) {
        return moduleMapper.searchModuleByParams(map);
    }
}
