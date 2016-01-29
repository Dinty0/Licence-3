class Main
{
	public static void main (String[] args)
	{
		Entier e = new EntierConcret(13);
		e = new Binaire(e);
		e = new Octal(e);
		e = new Hexadecimal(e);
		e.base();

	}
}