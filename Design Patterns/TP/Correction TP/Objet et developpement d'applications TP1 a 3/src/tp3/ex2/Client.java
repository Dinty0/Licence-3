package tp3.ex2;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		Billet billet = new Billet(new Date());
		billet.annuler();
		billet.modifierDate(new Date());
		
		billet.setEtatCourant(billet.getComfirme());
		billet.annuler();
		billet.modifierDate(new Date());

		billet.setEtatCourant(billet.getPartie());
		billet.annuler();
		billet.modifierDate(new Date());
	}

}
