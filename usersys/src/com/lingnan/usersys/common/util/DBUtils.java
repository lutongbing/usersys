package com.lingnan.usersys.common.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBUtils{
	
	/**
	 * *获取数据库连接的方法
	 * @return 返回获取到的数据库的连接
	 */
	public static Connection getConnection()  
	{
	Connection conn = null;
	try {
		//加载驱动
		Class.forName("oracle.jdbc.OracleDriver").newInstance();
		String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
		String user ="scott";
		String password = "123321";	
		//获得数据库连接对象
		conn = DriverManager.getConnection(url,user,password);
	} catch (ClassNotFoundException e) {
		System.out.print("不能建立数据库连接，驱动程序加载错误......");
		e.printStackTrace();
	} catch (SQLException e) {
		System.out.print("不能建立数据库连接......");
		e.printStackTrace();
	} catch (InstantiationException e) {
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("数据库连接成功......");
	return conn;
	}
	
	/**
	 * 事务开启
	 * @param conn
	 */
	public static void beginTransaction(Connection conn){
		try {
			//将事务的自动提交模式设为假
			conn.setAutoCommit(false);
		} catch (SQLException e) 
		{
			// 将异常封装成自定义异常
			System.out.println("事务开启失败");
		}
	}
	
	/**
	 * 提交事务
	 * @param conn
	 */
	public  static void commit(Connection conn) {
		try {
			//提交事务
			conn.commit();
			//将事务的自动提交模式设置为真
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			System.out.println("事务提交失败");
		}
	}
	public static void rollback(Connection conn){
		try {
			//回滚事务
			conn.rollback();
			//将事务的自动提交模式设置为真
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			// 将异常封装成自定义异常
			System.out.println("事务回滚失败");
		}
	}
	
	/**
	 * 关闭连接
	 * @param conn
	 */
	public static void closeConnection(Connection conn){
		
		try{
				if(conn!=null){ 
				conn.close();
				}
		}catch(Exception e){
			//将异常封装成自定义异常
			System.out.println("关闭连接对象失败");
		}
	}
	
	/**
	 * 关闭结果集
	 * @param rs
	 * @param stmt
	 */
	public static void closeStatement(ResultSet rs,Statement stmt) {
		try {
			//如果查询结果集对象不为空，关闭该对象
			if(rs!=null){
				rs.close();
			}
			//如果声明对象不为空，关闭该对象
		    if(stmt!=null){
		    	stmt.close();
		    }
		} catch (SQLException e) {
			System.out.println("关闭声明对象失败");
		}
	}
}