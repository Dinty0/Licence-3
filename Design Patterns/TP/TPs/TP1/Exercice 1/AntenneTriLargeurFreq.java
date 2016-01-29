import java.util.Comparator;

class AntenneTriLargeurFreq implements Comparator<Antenne> {

	public int compare(Antenne a1, Antenne a2)
	{
		return a1.getPlage().compareTo(a2.getPlage());
	}

}
