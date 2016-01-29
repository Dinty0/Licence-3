package tp6.ex2;

public class Multiprises {
	private String nom;
	
	public Multiprises(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return this.nom;
	}
	public void brancheMulti(){
		System.out.println(this.nom + " est brancher");

	}
	public void debrancherMulti(){
		System.out.println(this.nom + " est debrancher");
	}
}
