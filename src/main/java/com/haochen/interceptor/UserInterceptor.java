package com.haochen.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class UserInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		try {
			if (invocation.getMethod().getName().equals("printUser")) {// 拦截方法是否是UserService接口的printUser方法
				Object[] args = invocation.getArguments();// 被拦截的参数
				System.out.println("user:" + args[0]);
				invocation.getArguments()[0] = "hello!";// 修改被拦截的参数
			}

			System.out.println(invocation.getMethod().getName() + "---!");
			long start = System.currentTimeMillis();
			Object obj = invocation.proceed();// 运行UserService接口的printUser方法,返回的是调用方法的返回值
			long end = System.currentTimeMillis();
			System.out.println("运行方法[" + invocation.getMethod().getName() + "]耗时：" + (end - start) + "ms.");
			System.out.println("return obj:" + obj);
			return obj;

		} catch (Exception e) {
			throw e;
		}
	}
}
