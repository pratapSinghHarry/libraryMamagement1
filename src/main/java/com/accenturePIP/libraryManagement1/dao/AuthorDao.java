package com.accenturePIP.libraryManagement1.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accenturePIP.libraryManagement1.entity.AuthorEntity;
@Repository
public interface AuthorDao extends JpaRepository <AuthorEntity, Integer>{

}
