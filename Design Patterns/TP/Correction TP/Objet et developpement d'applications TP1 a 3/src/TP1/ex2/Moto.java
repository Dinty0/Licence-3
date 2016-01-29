package TP1.ex2;

public class Moto implements Vehicule{
	private Roue roues;
	private Moteur moteur;	
	
	public Moto(Roue roues, Moteur moteur) {
		this.roues = roues;
		this.moteur = moteur;
	}

	public String compostion() {
		return "j'ai " + this.roues + " roues et un moteur de " + this.moteur + " chevaux.";
	}

	public Roue getRoues() {
		return roues;
	}

	public Moteur getMoteur() {
		return moteur;
	}

	
	
}
