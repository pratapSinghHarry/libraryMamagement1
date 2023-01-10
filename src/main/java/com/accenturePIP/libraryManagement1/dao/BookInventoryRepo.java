package com.accenturePIP.libraryManagement1.dao;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.accenturePIP.libraryManagement1.entity.BookIventoryEntity;
@Repository
public interface BookInventoryRepo extends JpaRepository <BookIventoryEntity, Integer>{
    @Transactional
    @Modifying
	@Query("update BookIventoryEntity bkEnvntry set bkEnvntry.returnDateByUser=:bookReturnDate,bkEnvntry.bookReturnStatus=true where bkEnvntry.id= :inventroyId")
	public void updateInventoryAtReturnBook(@Param("bookReturnDate") LocalDate bookReturnDate, @Param("inventroyId") Integer inventroyId);
	@Query("select bkEnvntry from BookIventoryEntity bkEnvntry where bkEnvntry.bookReturnStatus=false and bkEnvntry.bookId=:bookId")
	public BookIventoryEntity findbookInventoryForReturn(Integer bookId);

}
