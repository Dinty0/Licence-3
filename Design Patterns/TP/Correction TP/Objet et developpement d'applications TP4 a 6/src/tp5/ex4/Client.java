package tp5.ex4;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Boisson b = new Expresso(0.75);
		b = new Lait(b);
		b = new Sucre(b);
		System.out.println(b.getDescription() + "  " + b.cout());
		
		Boisson b1 = new Expresso(1);
		b1 = new Lait(b1);
		b1 = new Sucre(b1);
		System.out.println(b1.getDescription() + "  " + b1.cout());
		
		Boisson b2 = new Expresso(1.25);
		b2 = new Lait(b2);
		b2 = new Sucre(b2);
		System.out.println(b2.getDescription() + "  " + b2.cout());
		
		Boisson b3 = new Expresso(1);
		b3 = new Lait(b3);
		b3 = new Lait(b3);
		b3 = new Sucre(b3);
		b3 = new Lait(b3);
		b3 = new Sucre(b3);
		System.out.println(b3.getDescription() + "  " + b3.cout());
	}

}
