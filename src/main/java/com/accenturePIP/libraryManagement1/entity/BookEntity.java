package com.accenturePIP.libraryManagement1.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books_detail")
public class BookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="book_name")
	private String bookName;
	@Column(name="subject")
	private Integer subject;
	@Column(name="author")
	private Integer author;
	@Column(name="edition")
	private String edition;
	@Column(name="stored_date")
	private Date storedDate;
	@Column(name="status")
	private boolean status;
	@Column(name="stored_by")
	private Integer storedBy;
	@Column(name="issued_status")
	private boolean issuedStatus;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
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
	public Date getStoredDate() {
		return storedDate;
	}
	public void setStoredDate(Date storedDate) {
		this.storedDate = storedDate;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Integer getStoredBy() {
		return storedBy;
	}
	public void setStoredBy(Integer storedBy) {
		this.storedBy = storedBy;
	}
	public boolean isIssuedStatus() {
		return issuedStatus;
	}
	public void setIssuedStatus(boolean issuedStatus) {
		this.issuedStatus = issuedStatus;
	}
	
	

}
