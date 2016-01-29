import java.util.Date;

class Main
{
	public static void main(String[] args)
	{
		Billet b = new Billet();
		b.modifierDate(new Date(2015,10,24));
		b.payer();

		b.reserver(new Date(2015,10,24));
		b.annuler();

		b.reserver(new Date(2015,10,31));
		b.modifierDate(new Date(2015,11,4));
		b.payer();
		b.annuler();

		b.setEtatVol("parti");
		System.out.println("Vol parti.");
		b.modifierDate(new Date(2015,11,16));
		b.annuler();
	}

}