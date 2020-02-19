package com.exam.myapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.myapp.entity.Salle;

public interface ISalleDao extends JpaRepository<Salle, Long>{

}
