package tp3.ex3;

public class Joueur {

	private String nom ;
	private int argent ;
	public Joueur ( String n, int m){
		nom = n;
		argent = m;
	}
	
	public String getNom(){
		return nom;
	}
	
	public int getArgent(){
		return argent;
	}
	public void debit(int m){
		argent -= m;
	}
	
	public void credit(int m){
		argent += m;
	}
}
