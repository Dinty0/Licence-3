class Main
{
  public static void main( String argv[] )
  {
    Horloge h = new Horloge();
    Affichage aff = new Affichage( h );

    System.out.println("L'horloge va fonctionner 10 secondes :");
    
    for( int i = 0 ; i < 10 ; ++i )
    {
      h.updateDate();
      try
      {
	Thread.sleep( 1000 );
      }
      catch( Exception e ) { }
    }
  }
}
