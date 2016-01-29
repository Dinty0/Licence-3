import java.util.Date;

abstract class Etat
{
	protected Billet _b;

	public Etat(Billet b)
	{
		_b = b;
	}

	public void reserver()
	{
		System.err.println("Vous ne pouvez pas réserver votre billet maintenant.");
	}
	public void payer()
	{
		System.err.println("Vous ne pouvez pas payer votre billet maintenant.");
	}
	public void modifierDate(Date d)
	{
		System.err.println("Vous ne pouvez pas modifier la date du billet maintenant.");
	}
	public void annuler()
	{
		System.err.println("Vous ne pouvez pas annuler votre billet maintenant.");
	}
	public abstract void afficherEtat();
}