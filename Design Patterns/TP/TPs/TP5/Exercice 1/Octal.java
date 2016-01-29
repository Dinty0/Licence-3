class Octal extends Decorator
{
	public Octal(Entier entier)
	{
		super(entier);
	}

	public void base()
	{
		int a = e.getEntier();
		String oct;
		int i = 0;

		while(a > 7)
		{
			char c = a%8;
			oct.charAt(i) = c;
			i++;
			a = a/8;
		}

		double res;
		for (int j=oct.length(); j>0; j--)
		{
			int o = oct.charAt(j);
			res =  (Math.pow(10,j)+o) + res;
		}
		
		System.out.println(res);

		e.base();
	}
}