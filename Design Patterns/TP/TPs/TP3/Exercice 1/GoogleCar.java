class GoogleCar
{
	private Etat _etatCourant;
	private Etat _etatArret;
	private Etat _etatAttente;
	private Etat _etatConduite;
	private boolean _allumer;
	private String _adresse;
	private boolean _arriver;

	public GoogleCar() 
	{
		_arriver = false;
		_etatArret = new EtatArret(this);
		_etatAttente = new EtatAttente(this);
		_etatConduite = new EtatConduite(this);
		setEtatCourant(_etatArret);
		_adresse = "";
	}

	public Etat getEtatCourant() 
	{
		return _etatCourant;
	}

	public Etat getEtatArret() 
	{
		return _etatArret;
	}

	public Etat getEtatAttente() 
	{
		return _etatAttente;
	}

	public Etat getEtatConduite() 
	{
		return _etatConduite;
	}

	public void setEtatCourant(Etat etatCourant) 
	{
		_etatCourant = etatCourant;
		_etatCourant.afficherEtat();
	}

	public void setAdresse(String s)
	{
		_adresse = s;
		if (getEtatCourant() == _etatAttente)
		{
			setEtatCourant(_etatConduite);
		}
		else
		{
			System.out.println("Vous ne pouvez pas saisir une adresse maitenant !");
		}
	}

	public String getAdresse()
	{
		return _adresse;
	}

	public void appuyerBouton()
	{
		if (getEtatCourant() == _etatAttente)
		{
			setEtatCourant(_etatArret);
		}
		else if (getEtatCourant() == _etatArret) 
		{
			setEtatCourant(_etatAttente);
		}
		else
		{
			System.out.println("Vous ne pouvez pas appuyer sur le bouton maintenant !");
		}
	}

	public boolean getArriver()
	{
		return _arriver;
	}

	public void setArriver(boolean b)
	{
		if (b)
		{
			setEtatCourant(_etatAttente);
		}
		_arriver = b;
	}



}