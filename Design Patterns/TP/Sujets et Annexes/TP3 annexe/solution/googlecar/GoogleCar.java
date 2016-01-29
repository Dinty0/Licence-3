class GoogleCar
{
  private Etat courant;
  private Etat arret;
  private Etat attente;
  private Etat conduite;

  public GoogleCar()
  {
    arret = new Arret( this );
    attente = new Attente( this );
    conduite = new Conduite( this );

    courant = arret;
  }

  public void appuyerBouton()
  {
    courant.bouton();
  }

  public void saisirLaDestination()
  {
    courant.saisieDestination();
    // une autre manière de faire :
    // on aurait pu appeler en plus courant.arrive() ici.
  }

  // get/set
  public void setEtat( Etat e ) { courant = e; }
  public Etat getCourant()	{ return courant; }
  public Etat getArret()	{ return arret; }
  public Etat getAttente()	{ return attente; }
  public Etat getConduite()	{ return conduite; }
}
