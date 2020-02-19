package com.exam.myapp.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
		@ManyToMany(cascade=CascadeType.PERSIST,mappedBy="seances",fetch =FetchType.LAZY)
		private List<Enseignant> enseignants = new ArrayList<Enseignant>();
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
		public List<Enseignant> getEnseignants() {
			return enseignants;
		}
		public void setEnseignants(List<Enseignant> enseignants) {
			this.enseignants = enseignants;
		}
		public Salle getSalle() {
			return salle;
		}
		public void setSalle(Salle salle) {
			this.salle = salle;
		}
		public Seance(long id, String type, Date dateDebut, Date dateFin, int duree, String matiere,
				List<Enseignant> enseignants, Salle salle) {
			super();
			this.id = id;
			this.type = type;
			this.dateDebut = dateDebut;
			this.dateFin = dateFin;
			this.duree = duree;
			this.matiere = matiere;
			this.enseignants = enseignants;
			this.salle = salle;
		}
		public Seance(long id, String type, Date dateDebut, Date dateFin, int duree, String matiere,
				List<Enseignant> enseignants) {
			super();
			this.id = id;
			this.type = type;
			this.dateDebut = dateDebut;
			this.dateFin = dateFin;
			this.duree = duree;
			this.matiere = matiere;
			this.enseignants = enseignants;
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
		public Seance(long id, String type, Date dateDebut, Date dateFin, int duree, String matiere) {
			super();
			this.id = id;
			this.type = type;
			this.dateDebut = dateDebut;
			this.dateFin = dateFin;
			this.duree = duree;
			this.matiere = matiere;
		}
		public Seance() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Seance [id=" + id + ", type=" + type + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
					+ ", duree=" + duree + ", matiere=" + matiere + ", enseignants=" + enseignants + ", salle=" + salle
					+ "]";
		}
		
		
}
