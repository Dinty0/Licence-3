package tp2.ex4;

public class Roi extends Personnage{

	public Roi(ComportementArme a){
		super(a);
	}

	@Override
	public void combattre() {
		System.out.print("Moi le Roi j'attaque");
		this.arme.utiliserArme();
	}
	
}
