package com.example.fouillearcho.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "fouille")
public class Fouille {
	@EmbeddedId
	private EquipeParcelleKey id;

	@ManyToOne
	@MapsId("equipeId")
	@JoinColumn(name = "equipe_id")
	private Equipe equipe;

	@ManyToOne
	@MapsId("parcelleId")
	@JoinColumn(name = "parcelle_id")
	private Parcelle parcelle;

	@Column(name = "dateFouille")
	@Temporal(TemporalType.DATE)
	private Date dateFouille;

	public Fouille() {
		super();
	}

	public Fouille(Equipe equipe, Parcelle parcelle, Date dateFouille) {
		this.equipe = equipe;
		this.parcelle = parcelle;
		this.dateFouille = dateFouille;
	}

	public EquipeParcelleKey getId() {
		return id;
	}

	public void setId(EquipeParcelleKey id) {
		this.id = id;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public Parcelle getParcelle() {
		return parcelle;
	}

	public void setParcelle(Parcelle parcelle) {
		this.parcelle = parcelle;
	}

	public Date getDateFouille() {
		return dateFouille;
	}

	public void setDateFouille(Date dateFouille) {
		this.dateFouille = dateFouille;
	}
}
