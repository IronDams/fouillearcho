package com.example.fouillearcho.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "objet")
public class Objet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name="designation")
	private String designation;

	@ManyToOne
	@JoinColumn(name="categorie_id")
	private Categorie categorie;

	@Column(name="completude")
	@Enumerated(EnumType.ORDINAL)
	private Completude completude;

	@Column(name="conservation")
	@Enumerated(EnumType.STRING)
	private Conservation conservation;

	@OneToOne
	@JoinColumns({
		@JoinColumn(name = "equipe_id"),
		@JoinColumn(name = "parcelle_id")})
	private Fouille fouille;

	public Objet() {
		super();
	}

	public Objet(String designation, Categorie categorie, Completude completude, Conservation conservation) {
		this.designation = designation;
		this.categorie = categorie;
		this.completude = completude;
		this.conservation = conservation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Completude getCompletude() {
		return completude;
	}

	public void setCompletude(Completude completude) {
		this.completude = completude;
	}

	public Conservation getConservation() {
		return conservation;
	}

	public void setConservation(Conservation conservation) {
		this.conservation = conservation;
	}
	
	public Fouille getFouille() {
		return fouille;
	}

	public void setFouille(Fouille fouille) {
		this.fouille = fouille;
	}
}
