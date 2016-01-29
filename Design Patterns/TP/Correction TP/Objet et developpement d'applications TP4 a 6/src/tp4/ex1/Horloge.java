package tp4.ex1;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Horloge implements Observeur{
	private Sujet dateSujet;
	private Date date;

	public Horloge(Sujet dS){
		this.dateSujet = dS;
		this.dateSujet.ajouterObs(this);
	}

	public void actualiser(Date d){
		this.date = d;
	}
	
	public void afficher(){
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");		
		System.out.println(dateFormat.format(this.date));
	}
}
