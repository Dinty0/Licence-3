import java.lang.*;
import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args)
	{
		Horloge horl = new Horloge();
		AffichageNumerique an = new AffichageNumerique(horl);
		horl.enregistrerObs(an);

		while(true)
		{
			horl.setHeure(new Date());
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException ie)
			{
				System.out.println("Erreur");
				ie.printStackTrace();
			}

		} 
	}
}