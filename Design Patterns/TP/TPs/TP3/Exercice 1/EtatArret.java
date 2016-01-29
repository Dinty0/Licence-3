class EtatArret extends Etat
{
	public EtatArret(GoogleCar gcar)
	{
		super(gcar);
	}

	public void saisirAdresse(String s)
	{
		System.out.println("Erreur : Allumez le moteur avant de saisir une nouvelle adresse");
	}

	public void appuyerBouton()
	{
		_gcar.setEtatCourant(_gcar.getEtatAttente());
	}

	public void afficherEtat()
	{
		System.out.println("Moteur arreté.");
	}
}