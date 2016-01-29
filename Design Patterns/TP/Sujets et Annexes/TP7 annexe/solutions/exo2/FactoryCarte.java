interface FactoryCarte
{
  Type creerType();
  Prestation creerPrestation();
}

class FactoryCarteVisa implements FactoryCarte
{
  public Type creerType()
  {
    return new TypeVisa();
  }
  
  public Prestation creerPrestation()
  {
    return new PrestationVisa();
  }  
}

class FactoryCarteMC implements FactoryCarte
{
  public Type creerType()
  {
    return new TypeMC();
  }
  
  public Prestation creerPrestation()
  {
    return new PrestationMC();
  }  
}

class FactoryCarteAE implements FactoryCarte
{
  public Type creerType()
  {
    return new TypeAE();
  }
  
  public Prestation creerPrestation()
  {
    return new PrestationAE();
  }  
}
