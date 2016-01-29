package tp5.ex1;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Entier entier = new Decimal(25);	
		entier = new Hexadecimal(entier);
		entier.base();
		
		Entier entier1 = new Decimal(25);
		entier1 = new Binaire(entier);
		entier1.base();
		
		Entier entier2 = new Decimal(25);
		entier2 = new Octal(entier);
		entier2.base();
	}

}
