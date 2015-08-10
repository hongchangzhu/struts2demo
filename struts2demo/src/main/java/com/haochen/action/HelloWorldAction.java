package com.haochen.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@Action(value = "helloworld")
@ParentPackage("test")
@Namespace("/a")
@Results({ @Result(name = "success", location = "/pages/result.jsp") })
public class HelloWorldAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6798738145555362022L;

	@Override
	public String execute() throws Exception {
		System.out.println("Hello World, struts2.");
		return SUCCESS;
	}

}
