package com.exam.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.myapp.dao.IGradeDao;
import com.exam.myapp.entity.Grade;

@Service
public class GradeService {

	@Autowired
	private IGradeDao gdao;

	public IGradeDao getGdao() {
		return gdao;
	}

	public void setGdao(IGradeDao gdao) {
		this.gdao = gdao;
	}
	
	public void ajout(Grade grd) {
		gdao.save(grd);
	}
	
	public void modif(Grade grd) {
		gdao.saveAndFlush(grd);
	}
	
	public void suppr(Long id) {
		gdao.deleteById(id);
	}
	
	public Grade find(Long id) {
		return gdao.getOne(id);
	}
	
	public List<Grade> findAll(){
		return gdao.findAll();
		}
	
	
}
