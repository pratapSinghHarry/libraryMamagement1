package com.accenturePIP.libraryManagement1.serviceImpl;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.accenturePIP.libraryManagement1.bean.BookInventory;
import com.accenturePIP.libraryManagement1.dao.BookInventoryRepo;
import com.accenturePIP.libraryManagement1.entity.BookIventoryEntity;
import com.accenturePIP.libraryManagement1.entity.FineDetailEntity;
import com.accenturePIP.libraryManagement1.service.BookInventoryService;
import com.accenturePIP.libraryManagement1.service.FineDetailService;
@Service
public class BookInventoryServiceImpl implements BookInventoryService {
	
	@Autowired
	private BookInventoryRepo bookInventoryRepo;
	@Autowired
	private FineDetailService fineDetailService;
	@Override
	public BookInventory issuedBook(BookInventory book) {
		try
		{
		BookIventoryEntity bookInventory =new BookIventoryEntity();
		bookInventory.setBookId(book.getBookId());
		LocalDate localDate = LocalDate.now();
		bookInventory.setBookIssueDate(localDate);
		bookInventory.setBookReturnDate(book.getReturnDate());
		bookInventory.setBookIssuedTo(book.getBookIssuedTo());
		bookInventory.setBookIssuedBy(book.getBookIssuedBy());
		bookInventory.setRemark(book.getRemarks());
		bookInventory.setBookReturnStatus(false);
		bookInventory=bookInventoryRepo.save(bookInventory);
		book.setInvetoryNo(bookInventory.getId());
		book.setBookId(bookInventory.getBookId());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return book;
	}
	@Override
	public String returnBook(Integer bookId) {
		String massege="";
		try {
			LocalDate currentDate = LocalDate.now();
			BookIventoryEntity bookInvnetory= bookInventoryRepo.findbookInventoryForReturn(bookId);
			if(bookInvnetory!=null)
			{
			LocalDate returnDate=bookInvnetory.getBookReturnDate();
			int dateCompare= currentDate.compareTo(returnDate);
			
			bookInventoryRepo.updateInventoryAtReturnBook(currentDate,bookInvnetory.getId());
			if(dateCompare>0)
			{
			
		        Period age = Period.between(currentDate,returnDate);
		        int duedays=age.getDays()*-1;
		        FineDetailEntity fineEntity= fineDetailService.saveFine(bookInvnetory, duedays);

				System.out.println(" Days Difference======>"+duedays+"    Fine Id=="+fineEntity.getId()+"   "+fineEntity.getFine());

			}
			massege= "Book returned ";
			}else
				massege= "Please enter valid book detail.";
		
	}
	catch(Exception e)
	{
		
		e.printStackTrace();
	}
		return massege;

	}
}
