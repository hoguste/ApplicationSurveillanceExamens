package com.exam.myapp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="enseignant")
public class Enseignant {
	@Id
	private long id;
	@Column
	private String nom;
	@Column
	private String prenom;
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="grade")
	private Grade grade;
	@Column
	private String matiere;
	@Column
	private String adresse;
	@Column 
	private String numTel;
	@Column
	private String mail;
	@OneToMany(mappedBy="enseignant1",cascade = CascadeType.PERSIST)
	private List<Seance> seances1 = new ArrayList<Seance>();
	@OneToMany(mappedBy="enseignant2",cascade = CascadeType.PERSIST)
	private List<Seance> seances2 = new ArrayList<Seance>();
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String role;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public List<Seance> getSeances1() {
		return seances1;
	}
	public void setSeances1(List<Seance> seances1) {
		this.seances1 = seances1;
	}
	public List<Seance> getSeances2() {
		return seances2;
	}
	public void setSeances2(List<Seance> seances2) {
		this.seances2 = seances2;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Enseignant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", matiere=" + matiere + ", adresse="
				+ adresse + ", numTel=" + numTel + ", mail=" + mail + ", username=" + username + ", password="
				+ password + "]";
	}
	public Enseignant(long id, String nom, String prenom, Grade grade, String matiere, String adresse, String numTel,
			String mail, List<Seance> seances1, List<Seance> seances2, String username, String password, String role) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.grade = grade;
		this.matiere = matiere;
		this.adresse = adresse;
		this.numTel = numTel;
		this.mail = mail;
		this.seances1 = seances1;
		this.seances2 = seances2;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	public Enseignant(long id, String nom, String prenom, String matiere, String adresse, String numTel, String mail,
			String username, String password) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.matiere = matiere;
		this.adresse = adresse;
		this.numTel = numTel;
		this.mail = mail;
		this.username = username;
		this.password = password;
	}
	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
