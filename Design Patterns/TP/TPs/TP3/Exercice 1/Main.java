import java.util.*;

class Main
{
	public static void main(String[] args) 
	{
		GoogleCar gcar = new GoogleCar();
		gcar.appuyerBouton();
		gcar.setAdresse("12 rue des gogoles");
		while (gcar.getArriver()==false)
		{
			gcar.appuyerBouton();
			gcar.setAdresse("42 rue des ewoks");

			System.out.println("On est arrivés ? (o/n) : ");
			Scanner terminalInput = new Scanner(System.in);
			String s = terminalInput.nextLine();
			if (s.charAt(0) == 'o')
			{
				gcar.setArriver(true);
			}
		}
		gcar.appuyerBouton();
	}

}