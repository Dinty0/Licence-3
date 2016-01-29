package tp2.ex4;

public class MarcheurBlanc extends Personnage{
	
	public MarcheurBlanc(ComportementArme a) {
		super(a);
	}

	@Override
	public void combattre() {
		System.out.print("heeuuuuuu, GAAAAH");
		this.arme.utiliserArme();
	}
}
