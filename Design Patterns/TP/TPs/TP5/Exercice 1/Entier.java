abstract class Entier
{
	private int _ent;

	public Entier(int entier)
	{
		_ent = entier;
	}

	public int getEntier()
	{
		return _ent;
	}

	public void setEntier(int e)
	{
		_ent = e;
	}

	public void base()
	{
		System.out.println(_ent);
	}
}