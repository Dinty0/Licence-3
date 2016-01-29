package tp5.ex1;

public abstract class Decorator extends Entier{
	protected Entier entier;

	public Decorator(Entier entier) {
		super(entier.getEntier());
	}

	public abstract void base();
}
