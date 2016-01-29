class Attente extends Etat
{
  public Attente( GoogleCar car )
  {
    super( car );
  }

  public void bouton()
  {
    System.out.println("Bouton appuyé lors de l'état d'attente : on éteint le moteur.");
    car.setEtat( car.getArret() );
  }
  
  public void saisieDestination()
  {
    System.out.println("Destination saisie : en voiture Simone !");
    car.setEtat( car.getConduite() );
    // on conduit pendant une seconde
    try
    {
      Thread.sleep( 1000 );
    }
    catch(Exception e){}
    
    car.getCourant().arrive();
  }
}
