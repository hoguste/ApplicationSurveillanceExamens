package com.exam.myapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.myapp.entity.Enseignant;

public interface IEnseignantDao extends JpaRepository<Enseignant, Long>{

}
