package com.exam.myapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.myapp.entity.Seance;

@Repository
public interface ISeanceDao extends JpaRepository<Seance, Long>{

}
