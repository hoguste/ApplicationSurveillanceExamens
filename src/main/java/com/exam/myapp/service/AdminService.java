package com.exam.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.myapp.dao.IAdminDao;
import com.exam.myapp.entity.Admin;

@Service
public class AdminService {

	@Autowired
	private IAdminDao adao;

	public IAdminDao getAdao() {
		return adao;
	}

	public void setAdao(IAdminDao adao) {
		this.adao = adao;
	}
	
	public void ajout(Admin adm) {
		adao.save(adm);
	}
	
	public void modif(Admin adm) {
		adao.saveAndFlush(adm);
	}
	
	public void suppr(Long id) {
		adao.deleteById(id);
	}
	
	public Admin find(Long id) {
		return adao.getOne(id);	
	}
	
	public List<Admin> findAll(){
		return adao.findAll();
	}
	
	
	
}
