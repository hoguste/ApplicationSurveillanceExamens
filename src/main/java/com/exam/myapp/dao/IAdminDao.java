package com.exam.myapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.myapp.entity.Admin;

@Repository
public interface IAdminDao extends JpaRepository<Admin, Long>{

}
