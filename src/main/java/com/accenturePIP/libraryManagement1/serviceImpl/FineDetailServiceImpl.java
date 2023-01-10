package com.accenturePIP.libraryManagement1.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenturePIP.libraryManagement1.dao.FineDetailDao;
import com.accenturePIP.libraryManagement1.entity.BookIventoryEntity;
import com.accenturePIP.libraryManagement1.entity.FineDetailEntity;
import com.accenturePIP.libraryManagement1.service.FineDetailService;
@Service
public class FineDetailServiceImpl implements FineDetailService {

    @Autowired
    private FineDetailDao findDao;
	@Override
	public FineDetailEntity saveFine(BookIventoryEntity bookInvntry, Integer dueDays) {
		
		Double totalFine=dueDays*10.00;
		FineDetailEntity fineEntity=new FineDetailEntity();
		try
		{
		fineEntity.setFine(totalFine);
		fineEntity.setPaidFine(0.00);
		fineEntity.setBookInvntry(bookInvntry.getId());
		fineEntity.setCashier(0);
		fineEntity.setBookId(bookInvntry.getBookId());
		fineEntity.setDueDays(dueDays);
		fineEntity.setIssuedTo(bookInvntry.getBookIssuedTo());
		fineEntity.setFineDepositDate(null);
		fineEntity= findDao.save(fineEntity);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return fineEntity;
	}

}
