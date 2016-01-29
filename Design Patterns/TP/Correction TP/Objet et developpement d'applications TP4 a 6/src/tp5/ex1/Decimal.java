package tp5.ex1;

public class Decimal extends Entier{

	public Decimal(int e) {
		super(e);
	}

	public void base() {
		this.aff = "L'entier " + this.getEntier() + ",0 sous sa forme decimal, ";
		System.out.print(aff);
	}

}
