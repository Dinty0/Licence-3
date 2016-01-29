class EtatPanier extends Etat
{
	public EtatPanier(Billet b)
	{
		super(b);
	}

	public void reserver()
	{
		_b.setEtatCourant(_b.getEtatReserve());
	}

	public void afficherEtat()
	{
		System.out.println("Le billet a bien été ajouté a votre panier.");
	}

}