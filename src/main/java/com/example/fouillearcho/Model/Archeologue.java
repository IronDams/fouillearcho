package com.example.fouillearcho.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "archeologue")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_archeologue")
public class Archeologue {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name="nom")
	private String nom;

	@Column(name="prenom")
	private String prenom;

	@ManyToOne
	@JoinColumn(name="equipe_id")
	private Equipe equipe;

	@ManyToOne
	@JoinColumn(name="directeur_id")
	private Directeur directeur;

	public Archeologue() {
		super();
	}
	public Archeologue(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	public Archeologue(String nom, String prenom, Equipe equipe) {
		this.nom = nom;
		this.prenom = prenom;
		this.equipe = equipe;
	}
	public Archeologue(String nom, String prenom, Equipe equipe, Directeur directeur) {
		this.nom = nom;
		this.prenom = prenom;
		this.equipe = equipe;
		this.directeur = directeur;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
}
