import java.util.*;
import java.text.*;

class Horloge implements Sujet
{
	private ArrayList<Observer> _obs;
	private Date _heure;

	public Horloge()
	{
		Date _heure = new Date();
	}

	public void enregistrerObs(Observer o)
	{
		_obs.add(o);
	}

	public void supprimerObs(Observer o)
	{
		_obs.remove(o);
	}

	public void notifierObs()
	{
		for (Observer o : _obs)
		{
			o.actualiser(_heure);
		}
	}

	public Date getHeure()
	{
		return _heure;
	}

	public void setHeure(Date h)
	{
		_heure = h;
		notifierObs();
	}
}