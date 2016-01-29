import java.util.*;
import java.text.*;

class AffichageNumerique implements Observer
{
	private Horloge _horloge;
	private Date _heure;

	public AffichageNumerique(Horloge h)
	{
		_horloge = h;
		_heure = _horloge.getHeure();
	}

	public void actualiser(Date _heure)
	{
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		System.out.println(df.format(_heure));
	}
}