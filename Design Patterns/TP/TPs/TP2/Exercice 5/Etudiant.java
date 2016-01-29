import java.util.Vector;

class Etudiant
{
	private CheminUniversite _chemin;
	private String _nom;
	private int _age;

	public Etudiant(String nom, int age, Transport t)
	{
		_nom = nom;
		_age = age;
		_chemin = new CheminUniversite(t);
	}

	public void allerFac()
	{
		System.out.println("Je m'appelle "+_nom+" et j'ai "+_age+" ans.");
		_chemin.aller();
	}

	public void setMoyenTransport(Transport t)
	{
		_chemin.setTransport(t);
	}

	public static void main(String args[])
	{
		Vector<Etudiant> etudiants = new Vector<Etudiant>();
		Etudiant m = new Etudiant("Michel", 44, new CptAudi());
		etudiants.add(m);
		Etudiant a = new Etudiant("Alexandre", 19, new CptTrain());
		etudiants.add(a);
		Etudiant b = new Etudiant("Brice", 25, new CptClio());
		etudiants.add(b);
		Etudiant i = new Etudiant("Igor", 22, new CptVelo());
		etudiants.add(i);
		Etudiant t = new Etudiant("Thierry", 20, new CptMarche());
		etudiants.add(t);

		for (int j=0; j<5; j++)
		{
			etudiants.get(j).allerFac();
		}

		i.setMoyenTransport(new CptMarche());
		i.allerFac();

	}
}