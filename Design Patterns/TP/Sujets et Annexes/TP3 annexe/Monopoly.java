class Joueur 
{
  private String nom_;
  private int    argent_;

  public Joueur( String n, int m ) 
  { 
    nom_    = n;
    argent_ = m; 
  }

  public String getNom()          
  { 
    return nom_; 
  }
  
  public int getArgent()
  {
    return argent_; 
  }

  public void debit( int m )
  {
    argent_ -= m;
  }
  
  public void credit( int m )
  {
    argent_ += m;
  }
}

class Propriete 
{
  private String nom_;
  private int    prix_;
  private int    droits_;
  private Joueur proprio_;

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

public class Monopoly
{
  public static void main( String [] args ) 
  {
    Joueur j1 = new Joueur( "Tom", 50 );
    Joueur j2 = new Joueur( "   Leo", 500 );
    Propriete prop = new Propriete( "Cours 50 Otages" );
    prop.visitePar( j1 );
    prop.visitePar( j2 );
    prop.visitePar( j1 );
    prop.visitePar( j2 );
    prop.visitePar( j1 );
  } 
}

// Tom arrive sur Cours 50 Otages - pas encore vendu
// Tom ne peut pas acheter ce terrain.
// Tom a 50 euros.
//    Leo arrive sur Cours 50 Otages - pas encore vendu
//    Leo achete Cours 50 Otages
//    Leo a 400 euros.
// Tom arrive sur Cours 50 Otages - appartient a    Leo
//    Leo a maintenant 410 euros.
// Tom a 40 euros.
//    Leo arrive sur Cours 50 Otages - appartient a    Leo
//    Leo a 410 euros.
// Tom arrive sur Cours 50 Otages - appartient a    Leo
//    Leo a maintenant 420 euros.
// Tom a 30 euros.