package tp5.ex1;

public class Hexadecimal extends Decorator{

	public Hexadecimal(Entier entier){
		super(entier);
	}

	public void base() {
		this.entier.base();
		System.out.println(this.aff + " le voici en hexadecimal, " + Integer.toHexString(this.getEntier()) );
	}


}
