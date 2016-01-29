package tp4.ex3;

public class Trader implements Observeur {
	private Sujet bourse;
	private double cac40; 
	private double nikkei; 
	private double nasdaq;
	
	public Trader(Sujet bourse) {
		this.bourse = bourse;
		this.bourse.ajouterObs(this);
	}

	public void actualiser(double cac40, double nikkei, double nasdaq) {
		this.cac40 = cac40;
		this.nasdaq = nasdaq;
		this.nikkei = nikkei;
	}

	public void afficher() {
		System.out.println("cac40 = " + this.cac40 + " nikkei = " + this.nikkei + " nasdaq = " + this.nasdaq);
	}

}
