package tp3.ex3;

public class Propriete {
	private String nom;
	private int prix;
	private int droits;
	private Etat etatCourant;
	private Etat etatLouer;
	private Etat etatNonLouer;
	private Etat etatNonAcheter;
	
	public Propriete(String nom) {
		this.nom = nom;
		this.prix = 100;
		this.droits = 100;
		this.etatLouer = new EtatLouer(this, null);
		this.etatNonLouer = new EtatNonLouer(this, null);
		this.etatNonAcheter = new EtatNonAcheter(this, null);
		this.etatCourant = this.etatNonAcheter;
	}
	
	public String getNom() {
		return nom;
	}
	public int getPrix() {
		return prix;
	}
	public int getDroitsDePassage() {
		return droits;
	}
	/*
	public Joueur getProprio() {
		return proprio;
	}

	public void setProprio(Joueur j){
		proprio = j ;
	}
	
	void visitePar(Joueur j){
		System.out.print(j.getNom() + " arrive sur " + nom ) ;
		if(getProprio() == null){
			System.out.print(" - pas encore vendu \n" + j.getNom() );
			if(j.getArgent() < getPrix()){
				System.out.println(" ne peut pas acheter ce terrain .");
			}else{
				j.debit(getPrix());
				setProprio(j);
				System.out.println(" achete " + nom);
			}
		}else{
			System.out.println(" - appartient a " + getProprio(). getNom());
			if( j != getProprio()){
				j.debit(getDroitsDePassage());
				getProprio().credit(getDroitsDePassage());
				System.out.println(getProprio().getNom ( ) + " a maintenant " + getProprio().getArgent() + " euros ." ) ;
			}
		}
		System.out.println(j.getNom() + " a " + j.getArgent()	+ " euros ." ) ;
	}*/
}
