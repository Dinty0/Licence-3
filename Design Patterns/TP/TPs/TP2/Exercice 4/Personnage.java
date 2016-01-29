class Personnage
{
	protected ComportementArme _arme;

	public Personnage(ComportementArme arme)
	{
		_arme = arme;
	}

	public void combattre()
	{
		_arme.utiliserArme();
	}

	public ComportementArme getArme()
	{
		return _arme;
	}

	public void setArme(ComportementArme arme)
	{
		_arme = arme;
	}
}