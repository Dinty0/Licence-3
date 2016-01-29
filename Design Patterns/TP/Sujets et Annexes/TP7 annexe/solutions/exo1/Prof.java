class Prof
{
  private String nom_;
  private FactoryCours factory_;
  private Cours cours_;

  public Prof( String nom, FactoryCours factory )
  {
    nom_ = nom;
    factory_ = factory;

    // utilisation de la factory
    cours_ = factory_.creerCours();
  }

  public void edt()
  {
    System.out.println("Prof " + nom_
		       + " a cours de " + cours_.getMatiere()
		       + " en " + cours_.getSalle() );
  }
}

