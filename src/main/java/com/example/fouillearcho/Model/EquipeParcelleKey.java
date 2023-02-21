package com.example.fouillearcho.Model;

import jakarta.persistence.Column;

public class EquipeParcelleKey {
	@Column(name ="equipe_id")
	private Long equipeId;
	@Column(name ="parcelle_id")
	private Long parcelleId;

	public EquipeParcelleKey(Long equipeId, Long parcelleId) {
		this.equipeId = equipeId;
		this.parcelleId = parcelleId;
	}

	public Long getEquipeId() {
		return equipeId;
	}

	public void setEquipeId(Long equipeId) {
		this.equipeId = equipeId;
	}

	public Long getParcelleId() {
		return parcelleId;
	}

	public void setParcelleId(Long parcelleId) {
		this.parcelleId = parcelleId;
	}
}
