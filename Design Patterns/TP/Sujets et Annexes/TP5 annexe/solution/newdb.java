import java.util.HashMap;

class NewDB
{
  private HashMap<String, Molecule> database_;

  public NewDB()
  {
    database_ = new HashMap<String, Molecule>();
  }

  public void newAdd( Molecule m ) { database_.put( m.getName(), m ); }
  public boolean exists( String name ) { return database_.containsKey( name ); }
  public Molecule newMolecule( String name ) { return database_.get( name ); }
}
