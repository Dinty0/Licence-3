class Propriete 
{
  private String nom_;
  private int    prix_;
  private int    droits_;
  private Joueur proprio_;

  private Etat _etatLibre;
  private Etat _etatPossede;
  private Etat _etatLoue;
  private Etat _etatCourant;

  public Propriete( String n ) 
  {
    nom_    = n;
    prix_   = 100;
    droits_  = 10;
  }

  public String getNom()
  { 
    return nom_;
  }

  public int getPrix()
  {
    return prix_;
  }

  public int getDroitsDePassage()
  {
    return droits_;
  }
  
  public Joueur getProprio()
  { 
    return proprio_; 
  }

  public void setProprio( Joueur j ) 
  { 
    proprio_ = j; 
  }

  void visitePar( Joueur j ) 
  {
    System.out.print( j.getNom() + " arrive sur " + nom_ );
    if (getProprio() == null) 
      {
	System.out.print( " - pas encore vendu\n" + j.getNom() );
	if (j.getArgent() < getPrix()) 
	  {
	    System.out.println( " ne peut pas acheter ce terrain." );
	  } 
	else 
	  {
	    j.debit( getPrix() );
	    setProprio( j );
	    System.out.println( " achete " + nom_ );
	  }
      } 
    else 
      {
	System.out.println( " - appartient a " + getProprio().getNom() );
	if (j != getProprio()) 
	  {
	    j.debit( getDroitsDePassage() );
	    getProprio().credit( getDroitsDePassage() );
	    System.out.println( getProprio().getNom() + " a maintenant "
				+ getProprio().getArgent() + " euros." );
	  }   
      }
    System.out.println( j.getNom() + " a " + j.getArgent()
			+ " euros." );
  }   
}