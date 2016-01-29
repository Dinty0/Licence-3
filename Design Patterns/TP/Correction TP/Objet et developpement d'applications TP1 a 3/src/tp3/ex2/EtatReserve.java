package tp3.ex2;

import java.util.Date;

public class EtatReserve extends Etat{

	public EtatReserve(Billet billet) {
		super(billet);
	}

	public boolean modifierDate(Date date){
		return true;
	}

	
	public void annuler() {
		System.out.println("Billet annuler !");
	}
}
