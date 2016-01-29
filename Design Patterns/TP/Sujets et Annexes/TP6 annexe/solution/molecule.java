class Molecule
{
  private String name_;
  private String formula_;

  public Molecule( String name, String formula )
  {
    name_ = name;
    formula_ = formula;
  }

  public String getName() { return name_; }
  public void affiche()
  {
    System.out.println( "Nom : " + name_ + "\nFormule : " + formula_ );
  }
}
