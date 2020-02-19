package com.exam.myapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.myapp.entity.Seance;

public interface ISeanceDao extends JpaRepository<Seance, Long>{

}
