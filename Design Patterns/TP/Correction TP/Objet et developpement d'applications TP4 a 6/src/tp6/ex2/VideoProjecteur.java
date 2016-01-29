package tp6.ex2;

public class VideoProjecteur {
	private String nom;
	
	public VideoProjecteur(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return this.nom;
	}

	public void brancheVP(Multiprises mp){
		System.out.println(this.nom + " est brancher sur " + mp.getNom());
	}
	public void debrancherVP(Multiprises mp){
		System.out.println(this.nom + " est debrancher de " + mp.getNom());
	}
	public void relierVP(Ordi ordinateur){
		System.out.println(this.nom + " relier a " + ordinateur.getNom());
	}
	public void allumerVP(){
		System.out.println(this.nom + " est allumer");
	}
	public void eteindreVP(){
		System.out.println(this.nom + " est eteind");
	}
}
