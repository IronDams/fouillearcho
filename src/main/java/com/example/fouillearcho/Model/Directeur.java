package com.example.fouillearcho.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue(value = "D")
public class Directeur extends Archeologue {

	@OneToMany(mappedBy = "directeur")
	private List<Archeologue> archeologues = new ArrayList<Archeologue>();

	public Directeur() {
		super();
	}

	public Directeur(String nom, String prenom, List<Archeologue> archeologues) {
		super(nom, prenom);
		this.archeologues = archeologues;
	}

	public List<Archeologue> getArcheologues() {
		return archeologues;
	}

	public void setArcheologues(List<Archeologue> archeologues) {
		this.archeologues = archeologues;
	}
}
