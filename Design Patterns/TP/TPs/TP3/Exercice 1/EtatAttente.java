class EtatAttente extends Etat
{
	public EtatAttente(GoogleCar gcar)
	{
		super(gcar);
	}

	public void saisirAdresse(String s)
	{
		_gcar.setAdresse(s);
		_gcar.setEtatCourant(_gcar.getEtatConduite());

	}

	public void appuyerBouton()
	{
		_gcar.setEtatCourant(_gcar.getEtatArret());

	}

	public void afficherEtat()
	{
		System.out.println("Attente de la saisie d'une nouvelle adresse...");
	}
}