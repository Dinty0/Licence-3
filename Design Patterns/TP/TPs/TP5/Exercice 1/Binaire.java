class Binaire extends Decorator
{

	public Binaire(Entier entier)
	{
		super(entier);
	}

	public void base()
	{
		int a = e.getEntier();
		String bin;
		int i = 0;
		while (a > 1)
		{
			char c = a%2;
			bin.charAt(i) = c;
			i++;
			a = a/2;
		}

		double res;
		for (int j=bin.length(); j>0; j--)
		{
			int o = bin.charAt(j);
			res =  (Math.pow(10,j)+bin.charAt(j)) + res;
		}
		
		System.out.println(res);

		e.base();
	}
}