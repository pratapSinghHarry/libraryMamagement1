package com.accenturePIP.libraryManagement1.bean;

import java.util.Date;

public class Book {
	private Integer bkId;
	private String bkName;
	private Integer subject;
	private Integer author;
	private String edition;
	private Date storedBKDate;
	private boolean bkStatus;
	private Integer storedBKBy;
	private String subjectName;
	private String authorName;
	private String storedbyUsrName;
	public Integer getBkId() {
		return bkId;
	}
	public void setBkId(Integer bkId) {
		this.bkId = bkId;
	}
	public String getBkName() {
		return bkName;
	}
	public void setBkName(String bkName) {
		this.bkName = bkName;
	}
	public Integer getSubject() {
		return subject;
	}
	public void setSubject(Integer subject) {
		this.subject = subject;
	}
	public Integer getAuthor() {
		return author;
	}
	public void setAuthor(Integer author) {
		this.author = author;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public Date getStoredBKDate() {
		return storedBKDate;
	}
	public void setStoredBKDate(Date storedBKDate) {
		this.storedBKDate = storedBKDate;
	}
	public boolean isBkStatus() {
		return bkStatus;
	}
	public void setBkStatus(boolean bkStatus) {
		this.bkStatus = bkStatus;
	}
	public Integer getStoredBKBy() {
		return storedBKBy;
	}
	public void setStoredBKBy(Integer storedBKBy) {
		this.storedBKBy = storedBKBy;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getStoredbyUsrName() {
		return storedbyUsrName;
	}
	public void setStoredbyUsrName(String storedbyUsrName) {
		this.storedbyUsrName = storedbyUsrName;
	}
	

}
