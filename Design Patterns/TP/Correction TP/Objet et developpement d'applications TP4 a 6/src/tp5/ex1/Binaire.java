package tp5.ex1;

public class Binaire extends Decorator{

	public Binaire(Entier entier) {
		super(entier);
	}

	@Override
	public void base() {
		this.entier.base();
		System.out.println(this.aff + " le voici en binaire, " + Integer.toBinaryString(this.getEntier()) );
	}

}
