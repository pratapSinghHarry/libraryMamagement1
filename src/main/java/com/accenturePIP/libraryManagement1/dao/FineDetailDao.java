package com.accenturePIP.libraryManagement1.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accenturePIP.libraryManagement1.entity.FineDetailEntity;
@Repository
public interface FineDetailDao extends JpaRepository<FineDetailEntity, Integer> {

}
