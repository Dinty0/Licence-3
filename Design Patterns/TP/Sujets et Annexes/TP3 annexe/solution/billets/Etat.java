import java.util.Date;

abstract class Etat
{
  protected Billet billet;

  public Etat( Billet b )
  {
    billet = b;
  }

  // Transitions
  public void reserver( Date date ) {}
  public void confirmerEtPayer() {}
  public void annuler() {}
  public void decollage() {}
  
  // Action
  public void modifierDate( Date date )
  {
    // action par défaut
    System.out.println("Il est impossible de modifier la date.");
  }
}
