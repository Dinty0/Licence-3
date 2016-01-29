package tp5.ex4;

public class Lait extends Decorator{

	public Lait(Boisson boisson){
		super(0.25, boisson.getFacteurTaille());
		this.boisson = boisson;
		this.description = " Lait ";
	}

	@Override
	public double cout(){
		return this.boisson.cout() + (this.boisson.getFacteurTaille() * this.cout);
	}

	@Override
	public String getDescription(){
		return this.boisson.getDescription() + " " + this.description;
	}

}
