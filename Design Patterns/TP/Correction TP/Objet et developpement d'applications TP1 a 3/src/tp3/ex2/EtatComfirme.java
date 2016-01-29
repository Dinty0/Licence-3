package tp3.ex2;

public class EtatComfirme extends Etat{

	public EtatComfirme(Billet billet) {
		super(billet);
	}

	public void annuler() {
		System.out.println("Billet annuler !");
	}
}
