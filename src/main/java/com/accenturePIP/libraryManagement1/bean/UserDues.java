package com.accenturePIP.libraryManagement1.bean;

import java.util.Date;

public class UserDues {
	private Integer userId;
	private String userName;
	private String userRole;
	private Date createdDate;
	private Double duesFine;
	private Double paidFine;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Double getDuesFine() {
		return duesFine;
	}
	public void setDuesFine(Double duesFine) {
		this.duesFine = duesFine;
	}
	public Double getPaidFine() {
		return paidFine;
	}
	public void setPaidFine(Double paidFine) {
		this.paidFine = paidFine;
	}
	

}
