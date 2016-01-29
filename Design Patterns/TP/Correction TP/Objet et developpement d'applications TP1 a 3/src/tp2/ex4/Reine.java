package tp2.ex4;

public class Reine extends Personnage{
	
	public Reine(ComportementArme a) {
		super(a);
	}

	@Override
	public void combattre() {
		System.out.print("Moi la Reine j'attaque");
		this.arme.utiliserArme();
	}
}
