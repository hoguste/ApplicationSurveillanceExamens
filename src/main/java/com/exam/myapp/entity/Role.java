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
@Table(name = "role")
public class Role {
	@Id
	private long id_Role;
	@Column
	private String nom_Role;
	@OneToMany(mappedBy = "role", cascade = CascadeType.PERSIST)
	
	private List<Admin> admins = new ArrayList<Admin>();
	@OneToMany(mappedBy = "role", cascade = CascadeType.PERSIST)
	private List<Enseignant> enseignants = new ArrayList<Enseignant>();

	

	public long getId_Role() {
		return id_Role;
	}

	public void setId_Role(long id_Role) {
		this.id_Role = id_Role;
	}

	public String getNom_Role() {
		return nom_Role;
	}

	public void setNom_Role(String nom_Role) {
		this.nom_Role = nom_Role;
	}

	public List<Admin> getAdmins() {
		return admins;
	}

	public void setAdmins(List<Admin> admins) {
		this.admins = admins;
	}

	public List<Enseignant> getEnseignants() {
		return enseignants;
	}

	public void setEnseignants(List<Enseignant> enseignants) {
		this.enseignants = enseignants;
	}

	public Role(long id, String nom, List<Admin> admins, List<Enseignant> enseignants) {
		super();
		this.id_Role = id;
		this.nom_Role = nom;
		this.admins = admins;
		this.enseignants = enseignants;
	}

	public Role(long id, String nom) {
		super();
		this.id_Role = id;
		this.nom_Role = nom;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

}
