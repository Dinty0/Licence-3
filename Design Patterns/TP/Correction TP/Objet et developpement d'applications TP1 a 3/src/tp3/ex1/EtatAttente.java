package tp3.ex1;

public class EtatAttente extends Etat{

	public EtatAttente(GoogleCar googleCar) {
		super(googleCar);
	}

	public boolean setAdresse(String adresse) {
		return true;
	}
	
	public void appuieBouton() {
		this.googleCar.setBouton(false);
	}
}
