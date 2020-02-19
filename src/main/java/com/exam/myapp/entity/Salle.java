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
public class Salle {
	@Id
	private long id;
	@Column
	private int capacite;
	@Column
	private String batiment;
	@Column
	private String etage;
	@Column
	private Boolean tp;
	@OneToMany(mappedBy="salle",cascade = CascadeType.PERSIST)
	private List<Seance> seances = new ArrayList<Seance>();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	public String getBatiment() {
		return batiment;
	}
	public void setBatiment(String batiment) {
		this.batiment = batiment;
	}
	public String getEtage() {
		return etage;
	}
	public void setEtage(String etage) {
		this.etage = etage;
	}
	public Boolean getTp() {
		return tp;
	}
	public void setTp(Boolean tp) {
		this.tp = tp;
	}
	public List<Seance> getSeances() {
		return seances;
	}
	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}
	public Salle(long id, int capacite, String batiment, String etage, Boolean tp, List<Seance> seances) {
		super();
		this.id = id;
		this.capacite = capacite;
		this.batiment = batiment;
		this.etage = etage;
		this.tp = tp;
		this.seances = seances;
	}
	public Salle(long id, int capacite, String batiment, String etage, Boolean tp) {
		super();
		this.id = id;
		this.capacite = capacite;
		this.batiment = batiment;
		this.etage = etage;
		this.tp = tp;
	}
	public Salle() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Salle [id=" + id + ", capacite=" + capacite + ", batiment=" + batiment + ", etage=" + etage + ", tp="
				+ tp + ", seances=" + seances + "]";
	}
	
}
