package com.lingnan.usersys.usermgr.domain;

import java.util.Date;



/**
 * 用户信息类
 * @author yldn
 *
 */
public class UserVO {
   private int id;         //主键
   private String name;    //用户名
   private String sex;     //性别
   private Date birth;     //生日
   private String loc;     //居住地址
   private String passwd;  //密码
   private int superuser;  //权限
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public Date getBirth() {
	return birth;
}
public void setBirth(Date birth) {
	this.birth = birth;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
public String getPasswd() {
	return passwd;
}
public void setPasswd(String passwd) {
	this.passwd = passwd;
}
public int getSuperuser() {
	return superuser;
}
public void setSuperuser(int superuser) {
	this.superuser = superuser;
}
	

}
