package com.exam.myapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.myapp.entity.Grade;

public interface IGradeDao extends JpaRepository<Grade, Long>{

}
