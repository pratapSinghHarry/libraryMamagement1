package com.accenturePIP.libraryManagement1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.accenturePIP.libraryManagement1.entity.UserDetail;


@Repository
public interface UserDetailRepo  extends JpaRepository<UserDetail, Integer>{
	@Query("select usr.id,usr.name,usr.loginId,usr.mobile,usr.createdDate,usr.status,rl.role from UserDetail usr,UserRole rl where usr.role=rl.id and usr.status=true and usr.name like %?1%")
	public List<Object[]> findUsersByName(@Param("name") String name);
	@Query("SELECT usrDtld.id,usrDtld.name,rol.role,usrDtld.createdDate,sum(fin.fine) AS duesFine,sum(fin.paidFine) AS paidFine FROM UserDetail usrDtld INNER JOIN FineDetailEntity fin ON fin.issuedTo=usrDtld.id INNER JOIN UserRole rol ON usrDtld.role=rol.id GROUP BY usrDtld.id")
	public List <Object[]> findUsersDues();
	

}
