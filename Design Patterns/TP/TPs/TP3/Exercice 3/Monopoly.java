



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