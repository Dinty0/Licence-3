package tp6.ex2;

public class Salle {
	private String nom;

	public Salle(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return this.nom;
	}

	public void allumerLumiere(){
		System.out.println(this.nom + " est allumer");

	}
	public void eteindreLumiere(){
		System.out.println(this.nom + " est eteinte");

	}
}
