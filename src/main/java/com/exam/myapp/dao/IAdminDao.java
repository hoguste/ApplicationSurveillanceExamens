package com.exam.myapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.myapp.entity.Admin;

public interface IAdminDao extends JpaRepository<Admin, Long>{

}
