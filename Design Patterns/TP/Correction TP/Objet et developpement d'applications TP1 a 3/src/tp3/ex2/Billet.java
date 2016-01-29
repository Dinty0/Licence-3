package tp3.ex2;

import java.util.Date;

public class Billet {
	private Etat reserve;
	private Etat comfirme;
	private Etat partie;
	private Etat etatCourant;
	private Date date;
	
	public Billet(Date date) {
		this.reserve = new EtatReserve(this);
		this.comfirme = new EtatComfirme(this);
		this.partie = new EtatPartie(this);
		this.setEtatCourant(this.reserve);
		this.date = date;
	}

	public void setEtatCourant(Etat etatCourant) {
		this.etatCourant = etatCourant;
		System.out.println("\n" + etatCourant.getClass().getSimpleName());
	}
	
	private void setDate(Date date){
		this.date = date;
		System.out.println("Date modifier !");
	}
	
	public void modifierDate(Date date){
		if(this.etatCourant.modifierDate(date)){
			this.setDate(date);
		}else{
			System.out.println("Changement de date impossible !");
		}
	}
	
	public void annuler(){
		this.etatCourant.annuler();
	}

	public Etat getReserve() {
		return reserve;
	}

	public Etat getComfirme() {
		return comfirme;
	}

	public Etat getPartie() {
		return partie;
	}

	public Etat getEtatCourant() {
		return etatCourant;
	}
	
	
}
