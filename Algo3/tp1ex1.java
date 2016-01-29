import java.lang.String;

class Main
{

	public static void decoupage(int tab[], int res[], int debut, int fin)
	{
		int milieu;
		if (debut < fin)
		{
			milieu = (debut + fin) / 2
			decoupage(tab,res,debut,milieu);
			decoupage(tab,res,milieu+1,fin);

			triFusion(tab,res,debut,milieu,fin);
		}
	}
	
	public static void triFusion(int tab[], int res[], int debut, int milieu, int fin)
	{


		

		/*
		for (int i = 0; i<taille; i++)
		{	
			if (i<demiTaille)
			{
				tab1.add(tab.get(i));
			}
			else
			{
				tab2.add(tab.get(i));
			}
		}
		
		tab.clear();
		int i=0;
		int j=0;

		while (tab.capacity() < taille)
		{

			if (i>demiTaille)
			{
				for (int k = j; j<demiTaille; j++)
				{
					tab.add(tab2.get(j));
				}
			}
			else if (j > demiTaille)
			{
				for (int k = i; i<demiTaille; i++)
				{
					tab.add(tab1.get(i));
				}
			}
			else if (tab1.get(i) <= tab2.get(j))
			{
				tab.add(tab1.get(i));
				i++;
			}
			else if (tab2.get(i) > tab2.get(j))
			{
				tab.add(tab2.get(j));
				j++;
			}
		}
	}
	*/
	public static void main (String[] args)
	{

	}
}