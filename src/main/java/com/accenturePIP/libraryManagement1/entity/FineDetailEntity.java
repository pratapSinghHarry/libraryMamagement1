package com.accenturePIP.libraryManagement1.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fine_detail")
public class FineDetailEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="fine")
	private Double fine;
	@Column(name="paid_fine")
	private Double paidFine;
	@Column(name="bk_iventory")
	private Integer bookInvntry;
	@Column(name="cashier")
	private Integer cashier;
	@Column(name="book")
	private Integer bookId;
	@Column(name="issue_to")
	private Integer issuedTo;
	@Column(name="dues_days")
	private Integer dueDays;
	@Column(name="fine_diposit_date")
	private LocalDate fineDepositDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getFine() {
		return fine;
	}
	public void setFine(Double fine) {
		this.fine = fine;
	}
	public Double getPaidFine() {
		return paidFine;
	}
	public void setPaidFine(Double paidFine) {
		this.paidFine = paidFine;
	}
	public Integer getBookInvntry() {
		return bookInvntry;
	}
	public void setBookInvntry(Integer bookInvntry) {
		this.bookInvntry = bookInvntry;
	}
	public Integer getCashier() {
		return cashier;
	}
	public void setCashier(Integer cashier) {
		this.cashier = cashier;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public Integer getIssuedTo() {
		return issuedTo;
	}
	public void setIssuedTo(Integer issuedTo) {
		this.issuedTo = issuedTo;
	}
	public Integer getDueDays() {
		return dueDays;
	}
	public void setDueDays(Integer dueDays) {
		this.dueDays = dueDays;
	}
	public LocalDate getFineDepositDate() {
		return fineDepositDate;
	}
	public void setFineDepositDate(LocalDate fineDepositDate) {
		this.fineDepositDate = fineDepositDate;
	}
	

}
