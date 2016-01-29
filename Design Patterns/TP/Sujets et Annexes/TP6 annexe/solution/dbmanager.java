import java.util.Vector;

class DBManager
{
  private OldDB ancienneBD_;
  private NewDB nouvelleBD_;
  private AdapterDB adapter_;

  private Vector<NewDB> BDs;
  
  public DBManager()
  {
    Molecule eau = new Molecule( "eau", "H2O" );
    Molecule ethanol = new Molecule( "ethanol", "CH3-CH2-OH" );
    
    ancienneBD_ = new OldDB();
    ancienneBD_.oldAdd( eau );

    nouvelleBD_ = new NewDB();
    nouvelleBD_.newAdd( ethanol );

    adapter_ = new AdapterDB( ancienneBD_ );

    BDs = new Vector<NewDB>();
    BDs.add( nouvelleBD_ );
    BDs.add( adapter_ );
  }

  public void printMolecule( String name )
  {
    boolean printSomething = false;
    
    for( NewDB bd : BDs )
      if( bd.exists( name ) )
      {
	bd.newMolecule( name ).affiche();
	printSomething = true;
      }
    
    if( !printSomething )
      System.out.println( "Molecule inconnue." );
  }
}
