package com.accenturePIP.libraryManagement1.serviceImpl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenturePIP.libraryManagement1.bean.Book;
import com.accenturePIP.libraryManagement1.bean.BookAuthorWise;
import com.accenturePIP.libraryManagement1.bean.BookBySubject;
import com.accenturePIP.libraryManagement1.bean.BooksCount;
import com.accenturePIP.libraryManagement1.dao.AuthorDao;
import com.accenturePIP.libraryManagement1.dao.BookDetailRepo;
import com.accenturePIP.libraryManagement1.dao.SubjectDao;
import com.accenturePIP.libraryManagement1.entity.AuthorEntity;
import com.accenturePIP.libraryManagement1.entity.BookEntity;
import com.accenturePIP.libraryManagement1.entity.Subject;
import com.accenturePIP.libraryManagement1.service.BookDetailService;
@Service
public class BookDetailServiceImpl  implements BookDetailService{
	@Autowired
	BookDetailRepo bookRepo;
	@Autowired
	SubjectDao subjectDao;
	@Autowired
	AuthorDao authorDao;

	@Override
	public Book addBook(Book book) {
		if(book!=null)
		{
		BookEntity bookEntity= new BookEntity();
		bookEntity.setBookName(book.getBkName());
		bookEntity.setSubject(book.getSubject());
		bookEntity.setAuthor(book.getAuthor());
		bookEntity.setEdition(book.getEdition());
		bookEntity.setStatus(true);
		bookEntity.setStoredDate(new Date());
		bookEntity.setStoredBy(book.getStoredBKBy());
		bookEntity.setIssuedStatus(false);
		bookEntity= bookRepo.save(bookEntity);
		book.setBkId(bookEntity.getId());
		}
		// TODO Auto-generated method stub
		return book;
	}

	@Override
	public Map<String, List<BookBySubject>> findSubjectWiseNoOfCopies() {
		Map<String, List<BookBySubject>> booksCopiesMap=new HashMap<String, List<BookBySubject>>();
		List <Object[]> bookList= bookRepo.findSubjectWiseNoOfCopies();
		List<Subject> subjectLst= subjectDao.findAll();
		if(bookList!=null)
		{
		for(Subject sub:subjectLst)
		{
			List<BookBySubject> bookSubList=new ArrayList<BookBySubject>();
			
		for(Object[] obj:bookList)
		{
			BookBySubject bookSub=new BookBySubject();
			if(sub.getId()==(Integer)obj[2])
			{
				bookSub.setBookId((Integer)obj[0]);
				bookSub.setBookName((String)obj[1]);
				bookSub.setSubjectId((Integer)obj[2]);
				bookSub.setSubjectName((String)obj[3]);
				bookSubList.add(bookSub);
				
			}
		}
		booksCopiesMap.put(sub.getSubject(), bookSubList);	
		System.out.println(sub.getSubject()+" : "+bookSubList.size());
		}
			
		}
		else
		{booksCopiesMap.put("No data found", null);}
		return booksCopiesMap;
	}

	@Override
	public List<BooksCount> findNumberOfBooks() {
		try
		{
			List<BooksCount> bookCountLst=new ArrayList<BooksCount>();
		
		List <Object[]> bookLst=  bookRepo.findNumbersOfCopies();
	
		if(bookLst!=null)
		{
		for(Object[] obj:bookLst)
		{
			BooksCount book=new BooksCount();
			book.setBookName((String)obj[0]);
			book.setSubjectName((String)obj[1]);
			book.setAuthorName((String)obj[2]);
			BigInteger count= (BigInteger)obj[3];
			book.setNumbersOfCopies(count.longValue());
			bookCountLst.add(book);
		}
		
		}
		return bookCountLst;
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, List<BookAuthorWise>> findbookListAuthorWise() {
		Map<String, List<BookAuthorWise>> booksCopiesMap=new HashMap<String, List<BookAuthorWise>>();
		List <Object[]> bookList= bookRepo.findBookListAuthorWise();
		List<AuthorEntity> authorLst= authorDao.findAll();
		if(bookList!=null)
		{
		for(AuthorEntity authr:authorLst)
		{
			List<BookAuthorWise> bookAuthorList=new ArrayList<BookAuthorWise>();
			
		for(Object[] obj:bookList)
		{
			BookAuthorWise bookAuthr=new BookAuthorWise();
			if(authr.getId()==(Integer)obj[3])
			{
				bookAuthr.setBookId((Integer)obj[0]);
				bookAuthr.setBookName((String)obj[1]);
				bookAuthr.setAuthorId((Integer)obj[3]);
				bookAuthr.setAuthorName((String)obj[5]);
				bookAuthr.setSubjectId((Integer)obj[2]);
				bookAuthr.setSubjectName((String)obj[4]);
				
				bookAuthorList.add(bookAuthr);
				
			}
		}
		booksCopiesMap.put(authr.getAuthorName(), bookAuthorList);	
		System.out.println(authr.getAuthorName()+" : "+bookAuthorList.size());
		}
			
		}
		else
		{booksCopiesMap.put("No data found", null);}
		return booksCopiesMap;

	}

}
