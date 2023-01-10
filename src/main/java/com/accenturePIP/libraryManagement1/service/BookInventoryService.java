package com.accenturePIP.libraryManagement1.service;
import com.accenturePIP.libraryManagement1.bean.BookInventory;

public interface BookInventoryService {
	public BookInventory issuedBook(BookInventory book);
	public String returnBook(Integer book);
	
	

}
