package tp3.ex2;

import java.util.Date;

public abstract class Etat {
	protected Billet billet;
	
	public Etat(Billet billet) {
		this.billet = billet;
	}
	
	public boolean modifierDate(Date date){
		return false;
	}

	public void annuler() {
		System.out.println("Annulation impossible !");
	}
}
