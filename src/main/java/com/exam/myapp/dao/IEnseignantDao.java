package com.exam.myapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.myapp.entity.Enseignant;

@Repository
public interface IEnseignantDao extends JpaRepository<Enseignant, Long>{

}
