abstract class Carte
{
  protected Type type;
  protected String proprietaire;
  protected Prestation prestations;

  protected FactoryCarte factory;
  
  public Carte( String proprietaire, FactoryCarte factory )
  {
    this.proprietaire = proprietaire;
    this.factory = factory;

    // utilisation de la factory
    type = factory.creerType();
    prestations = factory.creerPrestation();
  }
  
  public Type getType() { return type; }
  public String getProprietaire() { return proprietaire; }
  public Prestation getPrestation() { return prestations; }
}

class Visa extends Carte
{
  public Visa( String proprietaire )
  {
    super( proprietaire, new FactoryCarteVisa() );
  }
}

class MasterCard extends Carte
{
  public MasterCard( String proprietaire )
  {
    super( proprietaire, new FactoryCarteMC() );
  }
}

class AmericanExpress extends Carte
{
  public AmericanExpress( String proprietaire )
  {
    super( proprietaire, new FactoryCarteAE() );
  }
}
