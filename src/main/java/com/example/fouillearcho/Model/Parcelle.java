package com.example.fouillearcho.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "parcelle")
public class Parcelle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "longueur")
	private Float longueur;

	@Column(name = "largeur")
	private Float largeur;

	@ManyToOne
	@JoinColumn(name = "site_id")
	private Site site;

	@OneToMany(mappedBy = "parcelle")
	private List<Fouille> fouilles = new ArrayList<Fouille>();

	public Parcelle() {
		super();
	}

	public Parcelle(Float longueur, Float largeur, Site site) {
		this.longueur = longueur;
		this.largeur = largeur;
		this.site = site;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Float getLongueur() {
		return longueur;
	}

	public void setLongueur(Float longueur) {
		this.longueur = longueur;
	}

	public Float getLargeur() {
		return largeur;
	}

	public void setLargeur(Float largeur) {
		this.largeur = largeur;
	}

	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}
}
