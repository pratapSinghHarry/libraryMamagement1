package com.accenturePIP.libraryManagement1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.accenturePIP.libraryManagement1.entity.BookEntity;
@Repository
public interface BookDetailRepo extends JpaRepository <BookEntity, Integer> {
	//@Query("select sub.subject, count(bkEntity.id) BookEntity bkEntty, Subject sub where bkEntty.subject=sub.id GROUP BY sub.id")
	@Query(value= "SELECT bkdtl.id,bkdtl.book_name, bkdtl.subject, s.subject_name FROM  books_detail bkdtl INNER JOIN  subjects s ON bkdtl.subject=s.id ",nativeQuery=true)
	public List<Object[]> findSubjectWiseNoOfCopies();
	@Query(value= "SELECT bkdtl.book_name, subject_name, authr.author_name, COUNT(bkdtl.id) AS no_of_books FROM  books_detail bkdtl INNER JOIN  subjects s ON bkdtl.subject=s.id INNER JOIN author_details authr ON bkdtl.author=authr.id WHERE  bkdtl.issued_status=0 and bkdtl.`status`=1 GROUP BY bkdtl.book_name",nativeQuery=true)
	public List <Object[]> findNumbersOfCopies();
	@Query(value="SELECT bkdtl.id,bkdtl.book_name,bkdtl.subject,bkdtl.author, s.subject_name,authr.author_name from books_detail bkdtl INNER JOIN subjects s ON bkdtl.subject=s.id INNER JOIN author_details authr ON bkdtl.author=authr.id WHERE bkdtl.`status`=1;",nativeQuery=true)
    public List <Object[]> findBookListAuthorWise();
}
