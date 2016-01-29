abstract class Type
{
  protected String type;

  public Type( String type )
  {
    this.type = type;
  }

  public String toString()
  {
    return type;
  }
}

class TypeVisa extends Type
{
  public TypeVisa()
  {
    super("visa");
  }
}

class TypeMC extends Type
{
  public TypeMC()
  {
    super("master card");
  }
}

class TypeAE extends Type
{
  public TypeAE()
  {
    super("american express");
  }
}
