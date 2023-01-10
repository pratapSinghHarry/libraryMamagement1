package com.accenturePIP.libraryManagement1.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accenturePIP.libraryManagement1.bean.Book;
import com.accenturePIP.libraryManagement1.bean.BookAuthorWise;
import com.accenturePIP.libraryManagement1.bean.BookBySubject;
import com.accenturePIP.libraryManagement1.bean.BookInventory;
import com.accenturePIP.libraryManagement1.bean.BooksCount;
import com.accenturePIP.libraryManagement1.service.BookDetailService;
import com.accenturePIP.libraryManagement1.service.BookInventoryService;

@RestController
public class BookDetailController {
	@Autowired
	private BookDetailService bookDtlService;
	@Autowired
	private BookInventoryService bookInventroyService;
@PostMapping("/storeBook")
public String addBook(@RequestBody Book book)
{
	if(book!=null)
	{
		book= bookDtlService.addBook(book);
		 return "Book stored sucessfully!  "+book.getBkId()+":   "+book.getBkName()+"   "+HttpStatus.OK;
	}
	else
	{
		return "Book detail is not currect. " +HttpStatus.OK;
	}
	
	
}
@GetMapping("/issueBook")
public String issueBook(@RequestBody BookInventory bookInventory)
{
	Integer inventoryNo=  bookInventroyService.issuedBook(bookInventory).getInvetoryNo();
	return "Book issued..  "+" Invetory No: "+inventoryNo+"   "+bookInventory.getBookId()+"   Status: " +HttpStatus.OK;
}
@GetMapping("/returnBook/{bookId}")
public String returnBook(@PathVariable Integer bookId)
{
	String massege="Please enter vaild book Id";
	if(bookId!=null)
	{
		massege=	bookInventroyService.returnBook(bookId);
	}
	return massege;
}
@GetMapping("/findSubjectWiseBooks")
public Map<String,List<BookBySubject>> findSubjectWiseNoOfCopies()
{
	return bookDtlService.findSubjectWiseNoOfCopies();
}
@GetMapping("/findNumberOfBooks")
public List<BooksCount> findNumberOfBooks()
{
	return bookDtlService.findNumberOfBooks();
}
@GetMapping("/findAuthorWiseBookList")
public Map<String,List<BookAuthorWise>> findAuthorWiseBookList()
{
	return bookDtlService.findbookListAuthorWise();
}
}
