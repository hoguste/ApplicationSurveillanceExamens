package com.exam.myapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.myapp.dao.ISeanceDao;
import com.exam.myapp.entity.Seance;

@Service
public class SeanceService {

	@Autowired
	private ISeanceDao sedao;

	public ISeanceDao getSedao() {
		return sedao;
	}

	public void setSedao(ISeanceDao sedao) {
		this.sedao = sedao;
	}
	
	public void ajout(Seance sea) {
		sedao.save(sea);
	}
	
	public void modif(Seance sea) {
		sedao.saveAndFlush(sea);
	}
	
	public void suppr(Long id) {
		sedao.deleteById(id);
	}
	
	public Seance find(Long id) {
		return sedao.getOne(id);
	}
	
	public List<Seance> findAll(){
		return sedao.findAll();
	}
	
}
