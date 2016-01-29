class AdapterDB extends NewDB
{
  private OldDB oldDB_;

  public AdapterDB( OldDB oldDB )
  {
    oldDB_ = oldDB;
  }

  public boolean exists( String name ) { return oldDB_.exists( name ); }
  public Molecule newMolecule( String name ) { return oldDB_.oldMolecule( name ); }
}
