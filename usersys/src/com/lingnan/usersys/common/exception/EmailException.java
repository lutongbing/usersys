package com.lingnan.usersys.common.exception;

/**
 * Service异常
 * @author yldn
 *
 */
public class EmailException extends ServiceException{
	/**
	 * 默认的构造方法
	 */
	public EmailException(){
	}
	
	/**
	 * 构造方法
	 * @param arg0 异常的详细信息
	 */
	public EmailException(String arg0){
		super(arg0);
	}
	
	/**
	 * 构造方法
	 * @param arg1 异常产生的原因
	 */
	public EmailException(Throwable arg1){
		super(arg1);
	}
	
	/**
	 * 构造方法
	 * @param arg0  异常的详细信息
	 * @param arg1 异常产生的原因
	 */
	public EmailException(String arg0,Throwable arg1) {
		super(arg0,arg1);
		
	}
}
