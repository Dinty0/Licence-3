package tp5.ex1;

public class Octal extends Decorator{

	public Octal(Entier entier) {
		super(entier);
	}

	@Override
	public void base() {
		this.entier.base();
		System.out.println(this.aff + " le voici en octal, " + Integer.toOctalString(this.getEntier()) );
	}


}
