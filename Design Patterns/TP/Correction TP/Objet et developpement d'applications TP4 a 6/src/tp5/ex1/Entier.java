package tp5.ex1;

public abstract class Entier {
	protected int entier;
	protected String aff;
	
	public Entier(int e){
		this.entier = e;
	}
	public abstract void base();
	
	public int getEntier(){
		return this.entier;
	}
	public void setEntier(int e){
		this.entier = e;
	}
}
