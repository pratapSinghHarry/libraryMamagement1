package com.accenturePIP.libraryManagement1.service;

import com.accenturePIP.libraryManagement1.entity.BookIventoryEntity;
import com.accenturePIP.libraryManagement1.entity.FineDetailEntity;

public interface FineDetailService {
	
	public FineDetailEntity saveFine(BookIventoryEntity bookInvntry,Integer dueDays);

}
