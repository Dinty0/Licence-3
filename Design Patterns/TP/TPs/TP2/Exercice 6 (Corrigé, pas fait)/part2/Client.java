package tp2.ex6.part2;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] tab = {5, 3, 8, 9, 7, 6, 15};
		int[] tab2 = {0, 5000, 3000, 1000};
		Stat stat = new Stat(tab, new TriBulle());
		Stat stat2 = new Stat(tab2, new TriBulle());
		
		System.out.println("Stat 1 med : " + stat.getMedianne());
		System.out.println("Stat 1 max : " + stat.getMaximum());
		System.out.println("Stat 1 min : " + stat.getMinimum());
		
		System.out.println("Stat 2 med : " + stat2.getMedianne());
		System.out.println("Stat 2 max : " + stat2.getMaximum());
		System.out.println("Stat 2 min : " + stat2.getMinimum());		
		stat2.setTri(new TriInsertion());
		System.out.println("Stat 2 med : " + stat2.getMedianne());
		System.out.println("Stat 2 max : " + stat2.getMaximum());
		System.out.println("Stat 2 min : " + stat2.getMinimum());	
	}
	
	public static void afficherTab(int[] t){
		for(int i=0; i< t.length; ++i){
			System.out.print(t[i] + ", ");
		}
		System.out.println();
	}

}
