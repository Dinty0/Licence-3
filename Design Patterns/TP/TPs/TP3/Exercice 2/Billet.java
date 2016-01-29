import java.util.Date;

class Billet
{
	private Etat _etatPanier;
	private Etat _etatReserve;
	private Etat _etatConfirme;
	private Etat _etatCourant;
	private Date _date;
	private boolean _paye;
	private String _etatVol;

	public Billet()
	{
		_etatVol = "prévu";
		_etatPanier = new EtatPanier(this);
		_etatReserve = new EtatReserve(this);
		_etatConfirme = new EtatConfirme(this);
		setEtatCourant(_etatPanier);
		_paye = false;
		_date = new Date();
	}

	public Etat getEtatCourant() 
	{
		return _etatCourant;
	}

	public Etat getEtatPanier()
	{
		return _etatPanier;
	}

	public Etat getEtatReserve()
	{
		return _etatReserve;
	}

	public Etat getEtatConfirme()
	{
		return _etatConfirme;
	}

	public String getEtatVol()
	{
		return _etatVol;
	}

	public void setEtatCourant(Etat etat)
	{
		_etatCourant = etat;
		_etatCourant.afficherEtat();
	}

	public void setDate(Date d)
	{
		_date = d;
	}

	public void setPaye(boolean b)
	{
		_paye = b;
	}

	public void setEtatVol(String s)
	{
		_etatVol = s;
	}

	public void reserver(Date d)
	{
		_etatCourant.reserver();
	}

	public void payer()
	{
		_etatCourant.payer();
	}

	public void modifierDate(Date d)
	{
		_etatCourant.modifierDate(d);
	}

	public void annuler()
	{
		_etatCourant.annuler();
	}
}
