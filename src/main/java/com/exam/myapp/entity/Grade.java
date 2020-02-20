package com.exam.myapp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Grade {
	@Id
	private long id;
	@Column
	private String nom;
	@Column
	private int quotaSeances;
	@OneToMany(mappedBy ="grade", cascade = CascadeType.PERSIST)
	private List<Enseignant> enseignants = new ArrayList<Enseignant>();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getQuotaSeances() {
		return quotaSeances;
	}
	public void setQuotaSeances(int quotaSeances) {
		this.quotaSeances = quotaSeances;
	}
	public List<Enseignant> getEnseignants() {
		return enseignants;
	}
	public void setEnseignants(List<Enseignant> enseignants) {
		this.enseignants = enseignants;
	}
	public Grade(long id, String nom, int quotaSeances, List<Enseignant> enseignants) {
		super();
		this.id = id;
		this.nom = nom;
		this.quotaSeances = quotaSeances;
		this.enseignants = enseignants;
	}
	public Grade(long id, String nom, int quotaSeances) {
		super();
		this.id = id;
		this.nom = nom;
		this.quotaSeances = quotaSeances;
	}
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Grade [id=" + id + ", nom=" + nom + ", quotaSeances=" + quotaSeances + "]";
	}
	
	
	
}
