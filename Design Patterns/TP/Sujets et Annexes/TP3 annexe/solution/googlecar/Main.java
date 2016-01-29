class Main
{
  public static void main( String argv[] )
  {
    GoogleCar car = new GoogleCar();

    // tests de bidonneries 
    car.saisirLaDestination();
    car.saisirLaDestination();

    // moteur on
    car.appuyerBouton();
    // moteur off
    car.appuyerBouton();
    // re-moteur on
    car.appuyerBouton();

    // go!
    car.saisirLaDestination();

    // c'est reparti !
    car.saisirLaDestination();

    // dodo
    car.appuyerBouton();
  }
}
