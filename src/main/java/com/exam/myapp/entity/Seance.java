package com.exam.myapp.entity;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Seance {

		@Id
		private long id;
		@Column
		private String type;
		@Temporal (TemporalType.TIMESTAMP)
		private Date dateDebut;
		@Temporal(TemporalType.TIMESTAMP)
		private Date dateFin;
		@Column
		private int duree;
		@Column
		private String matiere;
		@ManyToOne(cascade=CascadeType.PERSIST)
		@JoinColumn(name="enseignant1")
		private Enseignant enseignant1;
		@ManyToOne(cascade=CascadeType.PERSIST)
		@JoinColumn(name="enseignant2")
		private Enseignant enseignant2;
		@ManyToOne(cascade=CascadeType.PERSIST)
		@JoinColumn(name="salle")
		private Salle salle;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Date getDateDebut() {
			return dateDebut;
		}
		public void setDateDebut(Date dateDebut) {
			this.dateDebut = dateDebut;
		}
		public Date getDateFin() {
			return dateFin;
		}
		public void setDateFin(Date dateFin) {
			this.dateFin = dateFin;
		}
		public int getDuree() {
			return duree;
		}
		public void setDuree(int duree) {
			this.duree = duree;
		}
		public String getMatiere() {
			return matiere;
		}
		public void setMatiere(String matiere) {
			this.matiere = matiere;
		}
		public Enseignant getEnseignant1() {
			return enseignant1;
		}
		public void setEnseignant1(Enseignant enseignant1) {
			this.enseignant1 = enseignant1;
		}
		public Enseignant getEnseignant2() {
			return enseignant2;
		}
		public void setEnseignant2(Enseignant enseignant2) {
			this.enseignant2 = enseignant2;
		}
		public Salle getSalle() {
			return salle;
		}
		public void setSalle(Salle salle) {
			this.salle = salle;
		}
		public Seance(long id, String type, Date dateDebut, Date dateFin, int duree, String matiere,
				Enseignant enseignant1, Enseignant enseignant2, Salle salle) {
			super();
			this.id = id;
			this.type = type;
			this.dateDebut = dateDebut;
			this.dateFin = dateFin;
			this.duree = duree;
			this.matiere = matiere;
			this.enseignant1 = enseignant1;
			this.enseignant2 = enseignant2;
			this.salle = salle;
		}
		public Seance(long id, String type, Date dateDebut, Date dateFin, int duree, String matiere, Salle salle) {
			super();
			this.id = id;
			this.type = type;
			this.dateDebut = dateDebut;
			this.dateFin = dateFin;
			this.duree = duree;
			this.matiere = matiere;
			this.salle = salle;
		}
		public Seance(long id, String type, Date dateDebut, Date dateFin, int duree, String matiere,
				Enseignant enseignant1, Enseignant enseignant2) {
			super();
			this.id = id;
			this.type = type;
			this.dateDebut = dateDebut;
			this.dateFin = dateFin;
			this.duree = duree;
			this.matiere = matiere;
			this.enseignant1 = enseignant1;
			this.enseignant2 = enseignant2;
		}
		public Seance() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Seance [id=" + id + ", type=" + type + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
					+ ", duree=" + duree + ", matiere=" + matiere + "]";
		}
		
		
		
		
}
