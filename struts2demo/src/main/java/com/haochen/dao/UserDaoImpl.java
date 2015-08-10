package com.haochen.dao;

import org.springframework.stereotype.Repository;

import com.haochen.vo.User;

/**
 * 
 * @title
 * @Description dao类，使用spring注解@Repository注册
 * @author chenhao
 * @date 2014年12月4日 上午9:11:28
 * @version 1.0
 */
@Repository("userDao")
public class UserDaoImpl implements IUserDao {

	@Override
	public User getUser(String name) {
		User user = new User();
		user.setName("tom");
		user.setAge(18);
		user.setSex('M');
		return user;
	}

}
