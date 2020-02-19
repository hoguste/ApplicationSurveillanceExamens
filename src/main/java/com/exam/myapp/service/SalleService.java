package com.exam.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.myapp.dao.ISalleDao;
import com.exam.myapp.entity.Salle;

@Service
public class SalleService {

	@Autowired
	private ISalleDao sadao;

	public ISalleDao getSadao() {
		return sadao;
	}

	public void setSadao(ISalleDao sadao) {
		this.sadao = sadao;
	}
	
	public void ajout(Salle sal) {
		sadao.save(sal);
	}
	
	public void modif(Salle sal) {
		sadao.saveAndFlush(sal);
	}
	
	public void suppr(Long id) {
		sadao.deleteById(id);
	}
	
	public Salle find(Long id) {
		return sadao.getOne(id);
	}
	
	public List<Salle> findAll(){
		return sadao.findAll();
	}
	
	
	
	
	
}
