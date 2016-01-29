package tp2.ex4;

public class Chevalier extends Personnage{

	public Chevalier(ComportementArme a) {
		super(a);
	}

	@Override
	public void combattre() {
		System.out.print("Moi le Chevalier j'attaque");
		this.arme.utiliserArme();
	}
}
