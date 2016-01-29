class Main
{
  public static void main( String args[] )
  {
    Prof p1 = new Prof( "Duchmol", new FactoryCoursInfo() );
    Prof p2 = new Prof( "Dubois", new FactoryCoursMaths() );
    Prof p3 = new Prof( "Dupont", new FactoryCoursChimie() );

    p1.edt();
    p2.edt();
    p3.edt();    
  }
}
