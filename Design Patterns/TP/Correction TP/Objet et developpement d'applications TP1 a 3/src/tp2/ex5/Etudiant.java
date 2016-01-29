package tp2.ex5;

public class Etudiant {
	private CheminUniversite cheminUniversite;
	private String nom;
	
	
	public Etudiant (String n, CheminUniversite cu){
		this.nom = n;
		this.cheminUniversite = cu;
	}
	
	public void setCheminUniversite(CheminUniversite cu){
		this.cheminUniversite = cu;
	}
	
	public void aller(){
		System.out.print(this.nom + " : ");
		this.cheminUniversite.aller();
	}
}
