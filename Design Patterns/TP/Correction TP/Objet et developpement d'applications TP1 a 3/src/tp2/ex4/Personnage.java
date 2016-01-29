package tp2.ex4;

public abstract class Personnage {
	protected ComportementArme arme;
	
	public Personnage (ComportementArme a){
		this.arme = a;
	}
	
	public abstract void combattre();
	
	public void setArme ( ComportementArme arme ){
		this.arme = arme ;
	}
}
