package com.accenturePIP.libraryManagement1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accenturePIP.libraryManagement1.entity.Subject;
@Repository
public interface SubjectDao extends JpaRepository <Subject, Integer> {

}
