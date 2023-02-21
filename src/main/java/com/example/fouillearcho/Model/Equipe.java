package com.example.fouillearcho.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "equipe")
public class Equipe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name="nom")
	private String nom;

	@OneToMany(mappedBy = "equipe")
	private List<Archeologue> archeologues = new ArrayList<Archeologue>();

	@OneToOne
	@JoinColumn(name="directeur_id")
	private Directeur directeur;

	@OneToMany(mappedBy="equipe")
	private List<Fouille> fouilles = new ArrayList<Fouille>();

	public Equipe() {
	}

	public Equipe(String nom, Directeur directeur) {
		this.nom = nom;
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

	public Directeur getDirecteur() {
		return directeur;
	}

	public void setDirecteur(Directeur directeur) {
		this.directeur = directeur;
	}
}
