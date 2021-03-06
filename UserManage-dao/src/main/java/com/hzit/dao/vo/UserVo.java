package com.hzit.dao.vo;

import com.hzit.dao.entity.Module;
import com.hzit.dao.entity.Role;

import javax.validation.constraints.AssertFalse;
import java.util.List;

/**
 * 
 * @author huangkangluan
 */
public class UserVo {
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
    private String roleName;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	private List<Module> moduleList;

	public List<Module> getModuleList() {
		return moduleList;
	}

	public void setModuleList(List<Module> moduleList) {
		this.moduleList = moduleList;
	}

	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
    /**
     * 用户ID
     * @return Integer
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
     * @return String
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
     * @return String
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
     * @return Integer
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
     * @return Integer
     */	
    public Integer getRoleId(){
    	return roleId;
    }

	@Override
	public String toString() {
		return "UserVo{" +
				"userId=" + userId +
				", userName='" + userName + '\'' +
				", password='" + password + '\'' +
				", isdelete=" + isdelete +
				", roleId=" + roleId +
				", moduleList=" + moduleList +
				'}';
	}
}