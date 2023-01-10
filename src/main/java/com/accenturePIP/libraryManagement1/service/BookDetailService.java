package com.accenturePIP.libraryManagement1.service;

import java.util.List;
import java.util.Map;
import com.accenturePIP.libraryManagement1.bean.BooksCount;
import com.accenturePIP.libraryManagement1.bean.Book;
import com.accenturePIP.libraryManagement1.bean.BookAuthorWise;
import com.accenturePIP.libraryManagement1.bean.BookBySubject;

public interface BookDetailService {
public Book addBook(Book book);
public Map<String, List<BookBySubject>> findSubjectWiseNoOfCopies();
public List<BooksCount> findNumberOfBooks();
public Map<String, List<BookAuthorWise>> findbookListAuthorWise();
}
