import java.util.Date;

class PasDeBillet extends Etat
{
  public PasDeBillet( Billet billet ) { super( billet ); }

  public void reserver( Date date )
  {
    System.out.println("Billet réservé pour " + date );
    billet.setDate( date );
    billet.setEtat( billet.getReserve() );
  }
}
