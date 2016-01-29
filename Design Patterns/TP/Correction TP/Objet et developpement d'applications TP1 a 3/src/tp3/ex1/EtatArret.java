package tp3.ex1;

public class EtatArret extends Etat{

	public EtatArret(GoogleCar googleCar) {
		super(googleCar);
	}
	
	public void appuieBouton() {
		this.googleCar.setBouton(true);
	}

}
