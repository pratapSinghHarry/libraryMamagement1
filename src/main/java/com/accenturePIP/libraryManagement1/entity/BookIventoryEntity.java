package com.accenturePIP.libraryManagement1.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_iventory")
public class BookIventoryEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="book_id")
	private Integer bookId;
	@Column(name="issued_date")
	private LocalDate bookIssueDate;
	@Column(name="return_date")
	private LocalDate BookReturnDate;
	@Column(name="issued_to")
	private Integer bookIssuedTo;
	@Column(name="issued_by")
	private Integer bookIssuedBy;
	@Column(name="remarks")
	private String remark;//
	@Column(name="return_date_by_user")
	private LocalDate returnDateByUser;
	//book_return_status
	@Column(name="book_return_status")
	private boolean bookReturnStatus;
	// 
	@Column(name="return_to")
	private Integer bookReturnTo;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	
	public LocalDate getBookIssueDate() {
		return bookIssueDate;
	}
	public void setBookIssueDate(LocalDate bookIssueDate) {
		this.bookIssueDate = bookIssueDate;
	}
	public LocalDate getBookReturnDate() {
		return BookReturnDate;
	}
	public void setBookReturnDate(LocalDate bookReturnDate) {
		BookReturnDate = bookReturnDate;
	}
	public Integer getBookIssuedTo() {
		return bookIssuedTo;
	}
	public void setBookIssuedTo(Integer bookIssuedTo) {
		this.bookIssuedTo = bookIssuedTo;
	}
	public Integer getBookIssuedBy() {
		return bookIssuedBy;
	}
	public void setBookIssuedBy(Integer bookIssuedBy) {
		this.bookIssuedBy = bookIssuedBy;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public LocalDate getReturnDateByUser() {
		return returnDateByUser;
	}
	public void setReturnDateByUser(LocalDate returnDateByUser) {
		this.returnDateByUser = returnDateByUser;
	}
	public boolean isBookReturnStatus() {
		return bookReturnStatus;
	}
	public void setBookReturnStatus(boolean bookReturnStatus) {
		this.bookReturnStatus = bookReturnStatus;
	}
	public Integer getBookReturnTo() {
		return bookReturnTo;
	}
	public void setBookReturnTo(Integer bookReturnTo) {
		this.bookReturnTo = bookReturnTo;
	} 


}
