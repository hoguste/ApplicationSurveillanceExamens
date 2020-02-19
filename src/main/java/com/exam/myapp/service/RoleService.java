package com.exam.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.exam.myapp.dao.IRoleDao;
import com.exam.myapp.entity.Role;

public class RoleService {
	@Autowired
	private IRoleDao roldao;

	public IRoleDao getRoldao() {
		return roldao;
	}

	public void setRoldao(IRoleDao roldao) {
		this.roldao = roldao;
	}
	
	public void ajout(Role role) {
		roldao.save(role);
	}
	
	

	
	

}
