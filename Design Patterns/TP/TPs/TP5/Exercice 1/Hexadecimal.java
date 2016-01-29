class Hexadecimal extends Decorator
{
	public Hexadecimal(Entier entier)
	{
		super(entier);
	}

	public void base()
	{
		int a = e.getEntier();
		String hex;
		int i = 0;

		while(a > 15)
		{
			int test = a%16;
			if (test > 9)
			{
				switch (test)
				{
					case 10 : test = 'A'; break;
					case 11 : test = 'B'; break;
					case 12 : test = 'C'; break;
					case 13 : test = 'D'; break;
					case 14 : test = 'E'; break;
					case 15 : test = 'F'; break;
				}
			}
			hex.charAt(i) = test;
			i++;
			a = a/16;
		}
		
		System.out.println(hex);

		e.base();
	}
}