package com.montassar.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Developpeur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDeveloppeur;
	private String nom;
	private Double salaire;
	private Date dateEmbauche;
	public Developpeur()
	{
		super();
	}
	public Developpeur(String nom, Double salaire, Date dateEmbauche) {
		super();
		this.nom = nom;
		this.salaire = salaire;
		this.dateEmbauche = dateEmbauche;
	}
	public Long getIdDeveloppeur() {
		return idDeveloppeur;
	}
	public void setIdDeveloppeur(Long idDeveloppeur) {
		this.idDeveloppeur = idDeveloppeur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Double getSalaire() {
		return salaire;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	public Date getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	@Override
	public String toString() {
		return "Developpeur [idDeveloppeur=" + idDeveloppeur + ", nom=" + nom + ", salaire=" + salaire
				+ ", dateEmbauche=" + dateEmbauche + "]";
	}
	
	

}
