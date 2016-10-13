package com.hzit.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import com.hzit.dao.entity.Rolemodule;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface RolemoduleMapper {

	void insertRolemodule(Rolemodule rolemodule);

	void deleteRolemoduleByRoleModuleId(Integer roleModuleId);

	void updateRolemodule(Rolemodule rolemodule);

	Page<Rolemodule> searchRolemoduleByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Rolemodule> searchRolemoduleByParams(@Param("map") Map<String, String> map);

} 
