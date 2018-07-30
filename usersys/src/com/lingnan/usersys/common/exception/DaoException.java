package com.lingnan.usersys.common.exception;

/**
 * service异常类
 * @author yldn
 *
 */
public class DaoException extends RuntimeException{

	/**
	 * 默认的构造方法
	 */
	public DaoException(){
	}
	
	/**
	 * 构造方法
	 * @param arg0 异常的详细信息
	 */
	public DaoException(String arg0){
		super(arg0);
	}
	
	/**
	 * 构造方法
	 * @param arg1 异常产生的原因
	 */
	public DaoException(Throwable arg1){
		super(arg1);
	}
	
	/**
	 * 构造方法
	 * @param arg0  异常的详细信息
	 * @param arg1 异常产生的原因
	 */
	public DaoException(String arg0,Throwable arg1) {
		super(arg0,arg1);
		
	}
	
}
