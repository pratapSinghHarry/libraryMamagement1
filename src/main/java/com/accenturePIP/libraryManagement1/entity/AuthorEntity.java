package com.accenturePIP.libraryManagement1.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="author_details")
public class AuthorEntity {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
private Integer id;
@Column(name="author_name")
private String authorName;
@Column(name="created_dt")
private LocalDate createdDate;
@Column(name="created_by")
private Integer createdBy;
@Column(name="abt_author")
private String abtAuthor;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getAuthorName() {
	return authorName;
}
public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
public LocalDate getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(LocalDate createdDate) {
	this.createdDate = createdDate;
}
public Integer getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(Integer createdBy) {
	this.createdBy = createdBy;
}
public String getAbtAuthor() {
	return abtAuthor;
}
public void setAbtAuthor(String abtAuthor) {
	this.abtAuthor = abtAuthor;
}

}
