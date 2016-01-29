class Main
{
  public static void main( String args[] )
  {
    if( args.length != 2 )
    {
      System.out.println("Vous devez donner le nom du destinataire ainsi que le type de carte (visa - par défaut - , mc ou ae) en paramètres à ce programme");
      System.exit(1);
    }
    
    Carte carte;

    if( args[1].equals( "mc" ) )
      carte = new MasterCard( args[0] );
    else if( args[1].equals( "ae" ) )
      carte = new AmericanExpress( args[0] );
    else
      carte = new Visa( args[0] );

    String lettre =
      " Cher/Chère M./Mme " + carte.getProprietaire()
      + ", vous trouverez ci-joint votre carte " + carte.getType()
      + " vous permettant de dénéficier d'une " + carte.getPrestation() + ".";

    System.out.println( lettre );
  }
}
