abstract class Prestation
{
  protected String prestation;

  public Prestation( String prestation )
  {
    this.prestation = prestation;
  }

  public String toString()
  {
    return prestation;
  }
}

class PrestationVisa extends Prestation
{
  public PrestationVisa()
  {
    super("assurance d'annulation de vol");
  }
}

class PrestationMC extends Prestation
{
  public PrestationMC()
  {
    super("assitance juridique à l'étranger");
  }
}

class PrestationAE extends Prestation
{
  public PrestationAE()
  {
    super("réduction de location de voiture");
  }
}
