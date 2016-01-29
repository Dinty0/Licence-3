package tp2.ex6.part1;

public class Client {

	public static void main(String[] args) {
		IA ia1 = new IA ("Chucky"); 
		IA ia2 = new IA ("George");
		IA ia3 = new IA ("AIUR");
		ia1.setStrategie(new StrategieAgressive());
		ia2.setStrategie(new StrategieDefensive());
		ia3.setStrategie(new StrategieNormale());
		ia1.action();
		ia2.action();
		ia3.action();
		System.out.println ( " Nouvelles strategies : " + " Chucky  va fuir .\n" + 
							" ’George  va passer en mode berserk .\n" ) ;
		ia1.setStrategie(new StrategieDefensive());
		ia2.setStrategie(new StrategieAgressive()) ;
		ia1.action();
		ia2.action();
		ia3.action();
	}

}
