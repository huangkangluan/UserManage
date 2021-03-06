package com.hzit.dao.entity;

/**
 * 
 * @author huangkangluan
 */
public class User {
	/**
	 *  用户ID
	 */
	private Integer userId;
	/**
	 *  用户名称
	 */
	private String userName;
	/**
	 *  用户密码
	 */
	private String password;
	/**
	 *  是否禁用
	 */
	private Integer isdelete;
	/**
	 *  角色ID
	 */
	private Integer roleId;
	/**
	 * 用户ID
	 * @param userId
	 */
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
    /**
     * 用户ID
     * @return
     */	
    public Integer getUserId(){
    	return userId;
    }
	/**
	 * 用户名称
	 * @param userName
	 */
	public void setUserName(String userName){
		this.userName = userName;
	}
	
    /**
     * 用户名称
     * @return
     */	
    public String getUserName(){
    	return userName;
    }
	/**
	 * 用户密码
	 * @param password
	 */
	public void setPassword(String password){
		this.password = password;
	}
	
    /**
     * 用户密码
     * @return
     */	
    public String getPassword(){
    	return password;
    }
	/**
	 * 是否禁用
	 * @param isdelete
	 */
	public void setIsdelete(Integer isdelete){
		this.isdelete = isdelete;
	}
	
    /**
     * 是否禁用
     * @return
     */	
    public Integer getIsdelete(){
    	return isdelete;
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
     * @return
     */	
    public Integer getRoleId(){
    	return roleId;
    }
}