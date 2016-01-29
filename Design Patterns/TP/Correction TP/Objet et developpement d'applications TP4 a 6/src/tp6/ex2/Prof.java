package tp6.ex2;

public class Prof {
	private Facade facade;
	private VideoProjecteur vp;
	private Ordi ordinateur;
	private Multiprises mp;
	private Salle salle;
	
	public Prof(Facade facade, VideoProjecteur vp, Ordi ordi, Multiprises mp, Salle salle) {
		this.facade = facade;
		this.vp = vp;
		this.ordinateur = ordi;
		this.mp = mp;
		this.salle = salle;
	}
	
	public void debutCour(){
		this.facade.allumer(this.vp, this.ordinateur, this.mp, this.salle);
	}
	
	public void finCour(){
		this.facade.eteindre(this.vp, this.ordinateur, this.mp, this.salle);
	}
}
