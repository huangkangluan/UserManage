package com.hzit.dao.vo;

/**
 * 
 * @author huangkangluan
 */
public class RoleVo {

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
     * @return Integer
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
     * @return String
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
     * @return String
     */	
    public String getRoleDescribe(){
    	return roleDescribe;
    }
}
