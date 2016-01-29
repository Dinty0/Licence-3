import java.util.Date;

class Billet
{
  private Date date_;

  private Etat courant_;
  private Etat pasDeBillet_;
  private Etat reserve_;
  private Etat paye_;
  private Etat perime_;  
  
  public Billet()
  {
    pasDeBillet_	= new PasDeBillet( this );
    reserve_		= new Reserve( this );
    paye_		= new Paye( this );
    perime_		= new Perime( this );

    courant_ = pasDeBillet_;
  }
  
  public Billet( Date date )
  {
    // appel du constructeur Billet()
    this();

    // initialisation de la date
    date_ = date;
  }

  // Transitions
  public void reserver( Date date ) { courant_.reserver( date ); }
  public void confirmerEtPayer() { courant_.confirmerEtPayer(); }
  public void annuler() { courant_.annuler(); }
  public void decollage() { courant_.decollage(); }
  
  // Action
  public void modifierDate( Date date ) { courant_.modifierDate( date ); }
  
  public Date getDate() { return date_; }
  public void setDate( Date date ) { date_ = date; }

  public void setEtat( Etat etat ) { courant_ = etat; }
  public Etat getCourant() { return courant_; }
  public Etat getPasDeBillet() { return pasDeBillet_; }
  public Etat getReserve() { return reserve_; }
  public Etat getPaye() { return paye_; }
  public Etat getPerime() { return perime_; }
}
