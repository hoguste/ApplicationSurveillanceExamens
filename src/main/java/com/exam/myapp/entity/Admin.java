package com.exam.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Admin {
@Id
private long id;
@Column
private String nom;
@Column
private String prenom;
@Column
private Boolean master;
@Column
private String numTel;
@Column
private String mail;
@Column
private String adresse;
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
public Boolean getMaster() {
	return master;
}
public void setMaster(Boolean master) {
	this.master = master;
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
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
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
public Admin(long id, String nom, String prenom, Boolean master, String numTel, String mail, String adresse,
		String username, String password, String role) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.master = master;
	this.numTel = numTel;
	this.mail = mail;
	this.adresse = adresse;
	this.username = username;
	this.password = password;
	this.role = role;
}
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Admin [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", master=" + master + ", numTel=" + numTel
			+ ", mail=" + mail + ", adresse=" + adresse + ", username=" + username + ", password=" + password
			+ ", role=" + role + "]";
}


}