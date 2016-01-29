class Conduite extends Etat
{
  public Conduite( GoogleCar car )
  {
    super( car );
  }

  public void arrive()
  {
    System.out.println("Arrivé à destination : on repasse en état d'attente.");
    car.setEtat( car.getAttente() );
  }
}
