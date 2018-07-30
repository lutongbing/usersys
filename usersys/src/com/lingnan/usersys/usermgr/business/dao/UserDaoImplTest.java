package com.lingnan.usersys.usermgr.business.dao;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import com.lingnan.usersys.common.util.DBUtils;
import com.lingnan.usersys.usermgr.domain.UserVO;

public class UserDaoImplTest {

	@Test
	public void testUserDaoImpl() {
	
	}

	@Test
	public void testLogin() {
		Connection conn = DBUtils.getConnection();
		UserDaoImpl ud = new UserDaoImpl(conn);
		UserVO uVo = new UserVO();
		uVo = ud.login("AAA", "123");
		System.out.println(uVo.getId()+"  "+uVo.getName()+"  "+uVo.getLoc());
	}

	@Test
	public void testAddUser() {

	}

}
