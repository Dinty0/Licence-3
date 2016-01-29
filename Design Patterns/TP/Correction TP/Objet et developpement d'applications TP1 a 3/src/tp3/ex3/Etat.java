package tp3.ex3;

public abstract class Etat {
	protected Propriete propriete;	
	protected Joueur proprio;


	public Etat(Propriete propriete, Joueur proprio) {
		this.propriete = propriete;
		this.proprio = proprio;
	}
	
	
}
