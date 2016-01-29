import java.util.Date;

class EtatReserve extends Etat
{
	public EtatReserve(Billet b)
	{
		super(b);
	}

	public void payer()
	{
		_b.setEtatCourant(_b.getEtatConfirme());
		_b.setPaye(true);
	}

	public void modifierDate(Date d)
	{
		if (_b.getEtatVol() != "prévu")
		{
			System.err.println("Il est trop tard pour modifier la date du billet");
		}
		else
		{
			_b.setDate(d);
			System.out.println("Date du billet modifiée");
		}
	}

	public void annuler()
	{
		if (_b.getEtatVol() != "prévu")
		{
			System.err.println("Il est trop tard pour annuler le billet");
		}
		else
		{
			_b.setEtatCourant(_b.getEtatPanier());
			System.out.println("Billet annulé. (Il est retourné dans votre panier)");
		}
	}

	public void afficherEtat()
	{
		System.out.println("Le billet a bien été réservé.");
	}

}