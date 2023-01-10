package com.accenturePIP.libraryManagement1.bean;

import java.time.LocalDate;
import java.util.Date;



public class BookInventory {
	private Integer invetoryNo;
	private Integer bookId;
	private String bookName;
	private LocalDate issuedDate;
	private LocalDate returnDate;
	private Integer bookIssuedTo;
	private Integer bookIssuedBy;
	private String remarks;
	public Integer getInvetoryNo() {
		return invetoryNo;
	}
	public void setInvetoryNo(Integer invetoryNo) {
		this.invetoryNo = invetoryNo;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public LocalDate getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
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
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	

}
