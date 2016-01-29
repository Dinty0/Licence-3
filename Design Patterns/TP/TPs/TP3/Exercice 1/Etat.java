abstract class Etat
{
	protected GoogleCar _gcar;

	public Etat(GoogleCar gcar)
	{
		_gcar = gcar;
	}

	public abstract void appuyerBouton();
	public abstract void saisirAdresse(String s);
	public abstract void afficherEtat();
}