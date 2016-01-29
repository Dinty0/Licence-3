import java.util.Date;

class Main
{
  public static void main( String argv[] )
  {
    Billet billet = new Billet();
    Date date = new Date();

    
    // tests de bidonneries 
    billet.modifierDate( date );
    billet.annuler();
    billet.decollage();
    
    // on réserve
    billet.reserver( date );
    // on annule
    billet.annuler();
    // on re-réserve
    date = new Date();
    billet.reserver( date );

    // paye ton billet
    billet.confirmerEtPayer();

    // on ne peut plus annuler
    billet.annuler();

    // dommage

    // l'avion décolle sans toi
    billet.decollage();
  }
}
