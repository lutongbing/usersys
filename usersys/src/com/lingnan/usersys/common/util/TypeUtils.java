package com.lingnan.usersys.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 类型转换
 * @author yldn
 *
 */
public class TypeUtils {

/**
 * 字符串转换为日期型
 * @param str 指定字符串
 * @return 转换的日期
 */
public static Date strToDate(String str)
{
	 Date date = null;
	//设置格式化的日期格式
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		//调用parse方法，将字符串解析成指定格式的日期类型
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//返回转换后的日期
		return date;
}


/**
 * 日期型转换为字符串
 * @param date 指定的日期型
 * @return 返回的字符串
 */
public static String dateToString(Date date)
{
	String str = null;
	//设置格式化的日期格式
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	str = sdf.format(date);
	return str;
}
 
public static boolean checkEmail(String email){
	String mail = email.replaceAll("^[a-z0-9A-Z]+[- | a-z0-9A-Z . _]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$", "");
	if(mail.length()==0){
		return true;
	}else{
		System.out.println("邮箱格式错误，请重新输入");
		return false;

	
}

	
}
}
