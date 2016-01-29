package tp4.ex1;

import java.util.Date;
import java.util.Vector;

public class SujetDate implements Sujet {
	private Vector<Observeur> observeurs;
	private Date date;
	
	public SujetDate(Date d){
		this.observeurs = new Vector<Observeur>();
		this.setDate(d);
	}
	
	public void ajouterObs(Observeur o){
		this.observeurs.add(o);
	}
	
	public void supprimerObs(Observeur o){
		this.observeurs.remove(o);
	}
	
	public void notifierObs(){
		for(Observeur o : this.observeurs){
			o.actualiser(this.date);
		}
	}
	
	public void setDate(Date d){
		this.date = d;
		this.notifierObs();
	}

	public Date getDate() {
		return this.date;
	}
}
