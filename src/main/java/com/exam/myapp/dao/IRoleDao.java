package com.exam.myapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.myapp.entity.Role;

public interface IRoleDao extends JpaRepository<Role, Long>{

}
