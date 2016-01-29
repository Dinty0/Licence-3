class EtatConduite extends Etat
{
	public EtatConduite(GoogleCar gcar)
	{
		super(gcar);
	}

	public void saisirAdresse(String s)
	{
		System.out.println("Erreur : Vous ne pouvez pas saisir une nouvelle adresse tant que la voiture n'est pas arrivée à sa destination.");
	}

	public void appuyerBouton()
	{
		System.out.println("Erreur : Vous ne pouvez pas eteindre le moteur tant que la voiture n'est pas arrivée à sa destination");
	}

	public void afficherEtat()
	{
		System.out.println("En route vers la destination "+_gcar.getAdresse()+"..." );
	}
}