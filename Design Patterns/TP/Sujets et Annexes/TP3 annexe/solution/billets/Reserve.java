import java.util.Date;

class Reserve extends Etat
{
  public Reserve( Billet billet ) { super( billet ); }

  public void confirmerEtPayer()
  {
    System.out.println("Billet confirmé et payé.");
    billet.setEtat( billet.getPaye() );

    try
    {
      Thread.sleep(1000);
    }
    catch(Exception e) {}

    billet.getCourant().decollage();
  }
  
  public void annuler()
  {
    System.out.println("Billet annulé.");
    billet.setEtat( billet.getPasDeBillet() );    
  }

  public void modifierDate( Date date )
  {
    System.out.println("Le billet est été modifié pour la date " + date );
    billet.setDate( date );
  }
}
