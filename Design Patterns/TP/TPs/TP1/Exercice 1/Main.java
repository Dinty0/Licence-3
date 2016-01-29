
import java.util.SortedSet;
import java.util.TreeSet;
import java.lang.String;

class Main{

	public static void main(String[] args)
	{
		SortedSet<Antenne> Set = new TreeSet<Antenne>(new AntenneTriLargeurFreq());
		Set.add(new Antenne(0, 1.0, 2.0, 300, 3000));
		Set.add(new Antenne(1, 2.5, 4.5, 250, 2500));
		Set.add(new Antenne(2, 1.0, 2.0, 400, 1000));
		Set.add(new Antenne(3, 2.5, 4.5, 250, 8500));
		
		for(Antenne a : Set)
		{
			System.out.println(a.toString());
		}
	}

}
