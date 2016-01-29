package tp2.ex6.part1;

public class IA {
	private String nom;
	private Strategie strategie;
	
	public IA(String string) {
		this.nom = string;
	}

	public void setStrategie(Strategie strategie) {
		this.strategie = strategie;
	}

	public void action() {
		this.strategie.action(this.nom);
	}

}
