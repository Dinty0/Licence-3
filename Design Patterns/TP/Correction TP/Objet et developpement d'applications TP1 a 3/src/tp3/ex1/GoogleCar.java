package tp3.ex1;

public class GoogleCar {
	private Etat etatCourant;
	private Etat etatArret;
	private Etat etatAttente;
	private Etat etatConduite;
	private boolean allumer;
	private String adresse;
	private boolean arriver;
	
	public GoogleCar(String adresse) {
		this.allumer = false;
		this.arriver = false;
		this.etatArret = new EtatArret(this);
		this.etatAttente = new EtatAttente(this);
		this.etatConduite = new EtatConduite(this);
		this.setEtatCourant(this.etatArret);
		this.adresse = adresse;
	}

	public void setEtatCourant(Etat etatCourant) {
		this.etatCourant = etatCourant;
	}
	
	public void appuieBouton(){
		this.etatCourant.appuieBouton();
		System.out.println("\n" + etatCourant.getClass().getSimpleName());
	}
	
	public void setAdresse(String adresse){
		if(this.etatCourant.setAdresse(adresse)){
			System.out.println("Changement de destination de : " + this.adresse + " vers " + adresse);
			this.adresse = adresse;
			this.setEtatCourant(this.etatConduite);
		}else{
			System.out.println("Changement d'adresse impossible.");
		}
	}

	public void setBouton(boolean b) {
		this.allumer = b;
		String s = (b) ? "Moteur est allumer." : "Moteur est étient";
		if(b){
			this.setEtatCourant(this.getEtatAttente());
		}else{
			this.setEtatCourant(this.getEtatArret());
		}
		System.out.println(s);
	}

	
	public boolean getArriver() {
		return arriver;
	}

	public void setArriver(boolean arriver) {
		this.arriver = arriver;
		System.out.println("Vous etes arriver !");
		this.setEtatCourant(this.etatAttente);
	}

	public Etat getEtatCourant() {
		return etatCourant;
	}

	public Etat getEtatArret() {
		return etatArret;
	}

	public Etat getEtatAttente() {
		return etatAttente;
	}

	public Etat getEtatConduite() {
		return etatConduite;
	}

	public String getAdresse() {
		return adresse;
	}
	
}
