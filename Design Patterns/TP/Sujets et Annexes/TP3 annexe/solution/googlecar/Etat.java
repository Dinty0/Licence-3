abstract class Etat
{
  protected GoogleCar car;

  public Etat( GoogleCar gc )
  {
    car = gc;
  }

  public void bouton() {}
  public void saisieDestination() {}
  public void arrive() {}
}
