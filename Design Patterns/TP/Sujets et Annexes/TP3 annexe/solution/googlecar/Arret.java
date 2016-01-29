class Arret extends Etat
{
  public Arret( GoogleCar car )
  {
    super( car );
  }

  public void bouton()
  {
    System.out.println("Bouton appuyé lors de l'état d'arrêt : on démarre le moteur.");
    car.setEtat( car.getAttente() );
  }
}
