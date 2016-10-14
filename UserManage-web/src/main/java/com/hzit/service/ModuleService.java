package com.hzit.service;

import com.hzit.dao.entity.Module;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/14.
 */
public interface ModuleService {
    public List<Module> findModule(Map map);
}
