package com.exam.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.myapp.dao.IEnseignantDao;
import com.exam.myapp.entity.Enseignant;

@Service
public class EnseignantService {

	@Autowired
	private IEnseignantDao edao;

	public IEnseignantDao getEdao() {
		return edao;
	}

	public void setEdao(IEnseignantDao edao) {
		this.edao = edao;
	}
	
	public void ajout(Enseignant ens) {
		edao.save(ens);
	}
	
	public void modif(Enseignant ens) {
		edao.saveAndFlush(ens);
	}
	
	public void suppr(Long id) {
		edao.deleteById(id);
	}
	
	public Enseignant find(Long id) {
		return edao.getOne(id);
	}
	
	public List<Enseignant> findAll(){
		return edao.findAll();
	}
	
}
