package TP1.ex1;

import java.util.Comparator;

public class Antenne implements Comparator<Antenne> {
	private int identifiant;
	private Position position;
	private PlageDeFequence plageDeFrequence;
	
	public Antenne(int identifiant, double latitude, double longitude, double frequenceMin, double frequenceMax) {
		this.identifiant = identifiant;
		this.position = new Position(latitude, longitude);
		this.plageDeFrequence = new PlageDeFequence(frequenceMin,frequenceMax);
	}

	public String toString() {
		return this.identifiant + ":[" + this.plageDeFrequence.toString() + "]@(" + this.position.toString() + ")";
	}
	
	public double distanceAvecAntenne(Antenne antenne) {
		double distance;
		distance = Math.sqrt(Math.pow(antenne.getPosition().getLongitude() - this.getPosition().getLongitude(), 2) + Math.pow(antenne.getPosition().getLatitude() - this.getPosition().getLatitude(), 2));
		return distance;
	}

	public double largeurPlageFrequence(){
		return this.getPlageDeFrequence().largeurPlageDeFrequence();
	}
		
	public int getIdentifiant() {
		return identifiant;
	}

	public Position getPosition() {
		return position;
	}

	public PlageDeFequence getPlageDeFrequence() {
		return plageDeFrequence;
	}

	public int compare(Antenne a1, Antenne a2) {
		return a1.getPlageDeFrequence().compareTo(a2.getPlageDeFrequence());
	}	
	
}

