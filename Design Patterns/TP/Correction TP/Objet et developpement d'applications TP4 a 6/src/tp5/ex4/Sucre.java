package tp5.ex4;

public class Sucre extends Decorator{
	public Sucre(Boisson boisson){
		super(0.25, boisson.getFacteurTaille());
		this.boisson = boisson;
		this.description = " Sucre ";
	}

	@Override
	public double cout(){
		return boisson.cout() + (this.boisson.getFacteurTaille() * this.cout);
	}

	@Override
	public String getDescription(){
		return boisson.getDescription() + " " + this.description;
	}
}
