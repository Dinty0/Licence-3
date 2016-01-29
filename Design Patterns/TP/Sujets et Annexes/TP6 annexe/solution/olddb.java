import java.util.HashMap;

class OldDB
{
  private HashMap<String, Molecule> database_;

  public OldDB()
  {
    database_ = new HashMap<String, Molecule>();
  }

  public void oldAdd( Molecule m ) { database_.put( m.getName(), m ); }
  public boolean exists( String name ) { return database_.containsKey( name ); }
  public Molecule oldMolecule( String name ) { return database_.get( name ); }
}
