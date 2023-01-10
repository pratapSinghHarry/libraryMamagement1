package com.accenturePIP.libraryManagement1.bean;

import java.util.Date;

public class User {
	private int id;
	private String name;
	private Integer role;
	private String roleName;
	private String loginId;
	private String mobile;
	private String userStatus;
	private Date createDate;
	private String password;
	private boolean isStatus;
	
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
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public boolean isStatus() {
		return isStatus;
	}
	public void setStatus(boolean isStatus) {
		this.isStatus = isStatus;
	}
	@Override
	public String toString()
	{
		return " User Details===> " +id
	     +"  "+name
	     +" "+role
		 +" "+roleName
		 +" "+loginId
		 +" "+mobile
		 +" "+userStatus
		 +" "+createDate
		 +" "+password
		 +" "+isStatus;
	}

}
