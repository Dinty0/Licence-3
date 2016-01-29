package tp5.ex4;

public abstract class Decorator extends Boisson{
	protected Boisson boisson;

	public Decorator(double cout, double taille) {
		super(cout, taille);
	}

}
