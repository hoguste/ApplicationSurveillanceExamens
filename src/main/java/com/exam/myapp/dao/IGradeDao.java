package com.exam.myapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.myapp.entity.Grade;

@Repository
public interface IGradeDao extends JpaRepository<Grade, Long>{

}
