class Main
{
	public static void main (String args[])
	{
		Personnage joffrey = new Roi(new CptPoignard());
		Personnage jaime = new Chevalier(new CptEpee());
		Personnage arya = new JonSnow(new CptArc());
		Personnage cersei = new Reine(new CptHache());

		joffrey.combattre();
		jaime.combattre();
		arya.combattre();
		cersei.combattre();
	}
}