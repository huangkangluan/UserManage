package com.hzit.dao.entity;

/**
 * 
 * @author huangkangluan
 */
public class Module {
	/**
	 *  模块ID
	 */
	private Integer moduleId;
	/**
	 *  模块名称
	 */
	private String moduleName;
	/**
	 *  模块级别
	 */
	private Integer moduleGrade;
	/**
	 *  父模块ID
	 */
	private Integer parentModuleId;
	/**
	 *  模块地址
	 */
	private String moduleAddress;
	/**
	 *  描述
	 */
	private String moduleDescribe;
	/**
	 *  是否有子模块
	 */
	private Integer childModule;
	/**
	 *  排序号
	 */
	private Integer moduleOrder;
	/**
	 * 模块ID
	 * @param moduleId
	 */
	public void setModuleId(Integer moduleId){
		this.moduleId = moduleId;
	}
	
    /**
     * 模块ID
     * @return
     */	
    public Integer getModuleId(){
    	return moduleId;
    }
	/**
	 * 模块名称
	 * @param moduleName
	 */
	public void setModuleName(String moduleName){
		this.moduleName = moduleName;
	}
	
    /**
     * 模块名称
     * @return
     */	
    public String getModuleName(){
    	return moduleName;
    }
	/**
	 * 模块级别
	 * @param moduleGrade
	 */
	public void setModuleGrade(Integer moduleGrade){
		this.moduleGrade = moduleGrade;
	}
	
    /**
     * 模块级别
     * @return
     */	
    public Integer getModuleGrade(){
    	return moduleGrade;
    }
	/**
	 * 父模块ID
	 * @param parentModuleId
	 */
	public void setParentModuleId(Integer parentModuleId){
		this.parentModuleId = parentModuleId;
	}
	
    /**
     * 父模块ID
     * @return
     */	
    public Integer getParentModuleId(){
    	return parentModuleId;
    }
	/**
	 * 模块地址
	 * @param moduleAddress
	 */
	public void setModuleAddress(String moduleAddress){
		this.moduleAddress = moduleAddress;
	}
	
    /**
     * 模块地址
     * @return
     */	
    public String getModuleAddress(){
    	return moduleAddress;
    }
	/**
	 * 描述
	 * @param moduleDescribe
	 */
	public void setModuleDescribe(String moduleDescribe){
		this.moduleDescribe = moduleDescribe;
	}
	
    /**
     * 描述
     * @return
     */	
    public String getModuleDescribe(){
    	return moduleDescribe;
    }
	/**
	 * 是否有子模块
	 * @param childModule
	 */
	public void setChildModule(Integer childModule){
		this.childModule = childModule;
	}
	
    /**
     * 是否有子模块
     * @return
     */	
    public Integer getChildModule(){
    	return childModule;
    }
	/**
	 * 排序号
	 * @param moduleOrder
	 */
	public void setModuleOrder(Integer moduleOrder){
		this.moduleOrder = moduleOrder;
	}
	
    /**
     * 排序号
     * @return
     */	
    public Integer getModuleOrder(){
    	return moduleOrder;
    }

	@Override
	public String toString() {
		return "Module{" +
				"moduleId=" + moduleId +
				", moduleName='" + moduleName + '\'' +
				", moduleGrade=" + moduleGrade +
				", parentModuleId=" + parentModuleId +
				", moduleAddress='" + moduleAddress + '\'' +
				", moduleDescribe='" + moduleDescribe + '\'' +
				", childModule=" + childModule +
				", moduleOrder=" + moduleOrder +
				'}';
	}
}