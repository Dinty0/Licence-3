package tp3.ex1;

public abstract class Etat {
	protected GoogleCar googleCar;

	public Etat(GoogleCar googleCar) {
		this.googleCar = googleCar;
	}

	public boolean setAdresse(String adresse) {
		return false;
	}

	public void appuieBouton() {
		System.out.println("Danger : vous avez essaye d'eteindre le moteur ! ");
	}
	
	
}
