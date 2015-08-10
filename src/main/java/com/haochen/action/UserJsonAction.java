package com.haochen.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.json.annotations.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.haochen.service.IUserService;

@Action(value = "userJson")
@ParentPackage("test")
@Namespace("/a")
public class UserJsonAction extends BaseJsonAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5818584581746655517L;

	private String name;

	// 指定bean名
	@Qualifier("userService")
	@Autowired
	private IUserService userService;

	@Override
	public String execute() throws Exception {
		String n = name;
		this.success(userService.getUser(n));

		/**
		 * 1、返回值为JSON,配置文件struts.xml中的<action></action>不用设置<result
		 * type="json"></result>。
		 * 2、返回值为SUCCESS,配置文件struts.xml中的<action></action>需要设置<result
		 * type="json"></result>。
		 **/
		return JSON;
	}

	// 不在json返回值中出现
	@JSON(serialize = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
