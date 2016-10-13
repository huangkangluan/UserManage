package com.hzit.dao.vo;

/**
 * 
 * @author huangkangluan
 */
public class RolemoduleVo {
	/**
	 *  主键ID
	 */
	private Integer roleModuleId;
	/**
	 *  角色ID
	 */
	private Integer roleId;
	/**
	 *  模块ID
	 */
	private Integer moduleId;
	/**
	 * 主键ID
	 * @param roleModuleId
	 */
	public void setRoleModuleId(Integer roleModuleId){
		this.roleModuleId = roleModuleId;
	}
	
    /**
     * 主键ID
     * @return Integer
     */	
    public Integer getRoleModuleId(){
    	return roleModuleId;
    }
	/**
	 * 角色ID
	 * @param roleId
	 */
	public void setRoleId(Integer roleId){
		this.roleId = roleId;
	}
	
    /**
     * 角色ID
     * @return Integer
     */	
    public Integer getRoleId(){
    	return roleId;
    }
	/**
	 * 模块ID
	 * @param moduleId
	 */
	public void setModuleId(Integer moduleId){
		this.moduleId = moduleId;
	}
	
    /**
     * 模块ID
     * @return Integer
     */	
    public Integer getModuleId(){
    	return moduleId;
    }
}