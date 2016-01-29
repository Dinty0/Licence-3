package tp5.ex1;

public class Normal extends Entier{

	public Normal(int e) {
		super(e);
	}

	public void base() {
		this.aff = "L'entier " + this.getEntier() + " sous sa forme normal, ";
		System.out.print(aff);
	}


}
