package com.exam.myapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.myapp.entity.Salle;

@Repository
public interface ISalleDao extends JpaRepository<Salle, Long>{

}
