package com.example.fouillearcho.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "site")
public class Site {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name ="ville")
	private String ville;

	@OneToMany(mappedBy = "site")
	private List<Parcelle> parcelles = new ArrayList<Parcelle>();

	public Site() {
		super();
	}

	public Site(String ville, List<Parcelle> parcelles) {
		this.ville = ville;
		this.parcelles = parcelles;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public List<Parcelle> getParcelles() {
		return parcelles;
	}

	public void setParcelles(List<Parcelle> parcelles) {
		this.parcelles = parcelles;
	}
}
