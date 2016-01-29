package tp5.ex4;

public abstract class Boisson {
	protected final double facteurTaille;
	protected final double cout;
	protected String description;
	
	public Boisson(double cout, double taille){
		this.cout = cout;
		this.facteurTaille = taille;
	}

	public double getFacteurTaille() {
		return facteurTaille;
	}

	public double cout(){
		return this.cout;
	}
	  
	public String getDescription(){
		return this.description;
	}

}
