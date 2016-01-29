package tp2.ex5;

public class Client {

	public static void main(String[] args) {
		Etudiant lucie = new Etudiant("lucie", new CheminUniversite( new EnAudi()));
		Etudiant julie = new Etudiant("julie", new CheminUniversite( new EnTram()));
		Etudiant zacks = new Etudiant("zacks", new CheminUniversite( new EnVelo()));
		Etudiant bobby = new Etudiant("bobby", new CheminUniversite( new EnClio()));
		Etudiant annie = new Etudiant("annie", new CheminUniversite( new Pied()));
		
		lucie.aller();
		julie.aller();
		zacks.aller();
		bobby.aller();
		annie.aller();
		
		annie.setCheminUniversite( new CheminUniversite( new EnAudi()));
		
		annie.aller();
	}

}
