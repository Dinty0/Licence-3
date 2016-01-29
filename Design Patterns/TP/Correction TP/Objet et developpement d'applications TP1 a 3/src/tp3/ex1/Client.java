package tp3.ex1;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GoogleCar googleCar = new GoogleCar("Une galaxie lointaine, tres lointaine.");
		googleCar.setAdresse("chez moi");
		googleCar.appuieBouton();
		googleCar.appuieBouton();
		googleCar.appuieBouton();
		googleCar.setAdresse("A BOLLIWOOD !");
		googleCar.appuieBouton();
		googleCar.setAdresse("A HOLLIWOOD !");
		googleCar.setArriver(true);
		googleCar.appuieBouton();
		googleCar.setAdresse("A BOLLIWOOD !");

	}

}
