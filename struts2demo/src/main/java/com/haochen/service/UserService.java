package com.haochen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.haochen.dao.IUserDao;
import com.haochen.vo.User;

/**
 * 
 * @title
 * @Description 业务类，使用spring注解@Service注册
 * @author chenhao
 * @date 2014年12月4日 上午9:12:39
 * @version 1.0
 */
@Service("userService")
public class UserService implements IUserService {

	/**
	 * 通过spring注解获取dao实例
	 */
	@Qualifier("userDao")
	@Autowired
	private IUserDao userDao;

	@Override
	public User getUser(String name) {
		return this.userDao.getUser(name);
	}

}
