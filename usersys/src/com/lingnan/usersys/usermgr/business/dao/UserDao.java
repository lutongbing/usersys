package com.lingnan.usersys.usermgr.business.dao;

import com.lingnan.usersys.common.dao.BaseDao;
import com.lingnan.usersys.usermgr.domain.UserVO;

public interface UserDao extends BaseDao{

	/**
	 * 注册用户/添加用户
	 * @param user 用户信息
	 * @return 成功返回true,失败返回false
	 */
	public boolean addUser(UserVO user);
	/**
	 * 用户登录
	 * @param name 用户名
	 * @param password 用户密码
	 * @return 用户信息
	 */
	public UserVO login(String name,String password);
}
