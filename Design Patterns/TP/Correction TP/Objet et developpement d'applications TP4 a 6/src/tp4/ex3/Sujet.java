package tp4.ex3;

public interface Sujet {
	public void ajouterObs(Observeur o);
	public void supprimerObs(Observeur o);
	public void notifierObs();
	public void setBourse() throws Exception;
}
