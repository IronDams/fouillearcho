package com.example.fouillearcho.Model;

public enum Conservation {
	A("Parfait"), B("Bon Etat"), C("Etat Moyen"), D("A Restaurer");

	private final String label;

	private Conservation(String label) {this.label = label;}

	public String getLabel() {return label;}

}
