import java.util.Date;

class EtatConfirme extends Etat
{
	public EtatConfirme(Billet b)
	{
		super(b);
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

	public void afficherEtat()
	{
		System.out.println("Le billet a bien été payé et confirmé.");
	}

}