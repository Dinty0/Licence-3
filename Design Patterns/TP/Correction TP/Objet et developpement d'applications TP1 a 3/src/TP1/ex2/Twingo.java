package TP1.ex2;

public class Twingo extends Voiture {
	private String couleur;
	private Conduteur personne;
	
	public Twingo(Roue roues, Moteur moteur, String couleur, Conduteur personne) {
		super(roues, moteur);
		this.couleur = couleur;
		this.personne = personne;
	}

	public String getCouleur() {
		return couleur;
	}

	public Conduteur getPersonne() {
		return personne;
	}
	
	

}
