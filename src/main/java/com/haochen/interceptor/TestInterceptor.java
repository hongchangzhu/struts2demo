package com.haochen.interceptor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestInterceptor {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
		UserService us = (UserService) ctx.getBean("userService");
		us.printUser("shawn");
	}

}
