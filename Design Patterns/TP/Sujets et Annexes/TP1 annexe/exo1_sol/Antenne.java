class Antenne implements Comparable<Antenne>
{
  private int		id_;
  private Position	position_;
  private Intervale	plage_;

  public Antenne( int id, Position position, Intervale plage )
  {
    id_		= id;
    position_	= position;
    plage_	= plage;
  }

  public Antenne( int id, double x, double y, int freqMin, int freqMax )
  {
    id_		= id;
    position_	= new Position	( x, y );
    plage_	= new Intervale	( freqMin, freqMax );
  }

  public double distance( Antenne antenne )
  {
    return Math.sqrt( Math.pow( ( antenne.getPosition().getX() - position_.getX() ), 2 ) + 
		      Math.pow( ( antenne.getPosition().getY() - position_.getY() ), 2 ) );
  }

  public int largeur() { return plage_.largeur(); }

  public int compareTo( Antenne antenne ) { return this.largeur() - antenne.largeur(); }
  
  public int getId() { return id_; }
  public Position getPosition() { return position_; }
  public Intervale getPlage() { return plage_; }
  
  public void setId( int id ) { id_ = id; }
  public void setPosition( Position position ) { position_ = position; }
  public void setPlage( int min, int max ) { plage_.setMinMax( min, max ); }

  public String toString() { return id_ + ":" + plage_ + "@" + position_; }
}
