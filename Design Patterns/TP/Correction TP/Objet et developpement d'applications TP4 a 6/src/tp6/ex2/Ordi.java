package tp6.ex2;

public class Ordi {	
	private String nom;
	
	public Ordi(String nom) {
		this.nom = nom;
	}
	
	public void brancherOrdi(Multiprises mp){
		System.out.println(this.nom + " est brancher sur " + mp.getNom());
	}
	public void debrancherOrdi(Multiprises mp){
		System.out.println(this.nom + " est debrancher de " + mp.getNom());
	}
	public void allumerOrdi(){
		System.out.println(this.nom + " est allumer");
	}
	public void eteindreOrdi(){
		System.out.println(this.nom + " est eteind");
	}
	public String getNom() {
		return this.nom;
	}
}
