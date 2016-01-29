class Paye extends Etat
{
  public Paye( Billet billet ) { super( billet ); }

  public void decollage()
  {
    System.out.println("En avion Simone !");
    billet.setEtat( billet.getPerime() );
  }
}
