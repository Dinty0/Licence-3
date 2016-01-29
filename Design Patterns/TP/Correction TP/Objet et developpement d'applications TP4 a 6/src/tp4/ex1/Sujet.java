package tp4.ex1;

import java.util.Date;

public interface Sujet {
	public void ajouterObs(Observeur o);
	public void supprimerObs(Observeur o);
	public void notifierObs();
	public void setDate(Date d);
}
