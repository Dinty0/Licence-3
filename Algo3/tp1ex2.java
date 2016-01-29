import java.lang.String;

class ArbreBinaire
{
	private char _racine;
	private ArbreBinaire _fD;
	private ArbreBinaire _fG;

	public ArbreBinaire(char racine)
	{
		_racine = racine;
		_fD = null;
		_fG = null;
	}

	public ArbreBinaire(char racine, ArbreBinaire* fD, ArbreBinaire* fG)
	{
		_racine = racine;
		_fD = fD;
		_fG = fG;
	}

	public ArbreBinaire(String str)
	{
		if (str.length < 3)
		{
			System.out.println("Chaine trop petite\n");
			System.out.println("Arbre créé avec "+str.charAt(0)+" comme fils gauche, et "+str.charAt(1)+" comme racine, le fils droit étant 'null'\n");
			_racine = str.charAt(1);
			_fG = new ArbreBinaire(str.charAt(0));
			_fD = null;
		}
		else if (str.length() == 3)
		{
			_racine = str.charAt(1);
			_fG = new ArbreBinaire(str.charAt(0));
			_fD = new ArbreBinaire(str.charAt(2));
		}
		else
		{
			if (str.charAt(0) != '(')
			{
				_fG = new ArbreBinaire(str.charAt(0))
				_racine = str.charAt(1);
				String strD = new String("");
				for (int i = 2; i<str.length; i++)
				{
					strD = strD + str.charAt(i);
				}
				_fD = new ArbreBinaire(strD);
			}
			else if((str.charAt(0) == '(') && (str.charAt(str.length-1) == ')'))
			{
				int nbParO = 0;
				int nbParF = 0;
				int k=0;

				while ((nbParO != nbParF) && nbParO !=0 && nbParF !=0)
				{
					if (str.charAt(k) == '(')
					{
						++nbParO;
					}
					if (str.charAt(k) == ')')
					{
						++nbParF;
					}
					++k
				}

				_racine = new ArbreBinaire(str.charAt(k));

				String strD = new String("");
				String strG = new String("");
				for (int i = 1; i<k-1; i++)
				{
					strG = strG+str.charAt(i);
				}
				for (int j = k+1; j<str.length-1; j++)
				{
					strD = strD+str.charAt(j);
				}
				
				_fG = new ArbreBinaire(strG);
				_fD = new ArbreBinaire(strD);
			}

			if(str.charAt(str.length-1) == ')')
			{
				String strG = new String(""); 
				for (int i=0;)
				// A FINIR
			}
		}
	}

}