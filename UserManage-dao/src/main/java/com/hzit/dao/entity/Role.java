package com.hzit.dao.entity;

/**
 * 
 * @author huangkangluan
 */
public class Role {
	/**
	 *  角色ID
	 */
	private Integer roleId;
	/**
	 *  角色名称
	 */
	private String roleName;
	/**
	 *  角色描述
	 */
	private String roleDescribe;
	/**
	 * 角色ID
	 * @param roleId
	 */
	public void setRoleId(Integer roleId){
		this.roleId = roleId;
	}
	
    /**
     * 角色ID
     * @return
     */	
    public Integer getRoleId(){
    	return roleId;
    }
	/**
	 * 角色名称
	 * @param roleName
	 */
	public void setRoleName(String roleName){
		this.roleName = roleName;
	}
	
    /**
     * 角色名称
     * @return
     */	
    public String getRoleName(){
    	return roleName;
    }
	/**
	 * 角色描述
	 * @param roleDescribe
	 */
	public void setRoleDescribe(String roleDescribe){
		this.roleDescribe = roleDescribe;
	}
	
    /**
     * 角色描述
     * @return
     */	
    public String getRoleDescribe(){
    	return roleDescribe;
    }
}