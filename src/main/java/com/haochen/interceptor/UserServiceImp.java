package com.haochen.interceptor;

public class UserServiceImp implements UserService {

	@Override
	public int printUser(String user) {
		System.out.println("printUser user:" + user);
		int count = 0;
		for (int i = 0; i < 1000000; i++) {
			count += i;
			// System.out.println("per count:" + count);
		}
		System.out.println("total:" + count);
		return count;
	}

}
