package tp2.ex6.part2;

public class TriBulle implements Tri{

	public int[] tri(int[] tableau) {
		for(int i = tableau.length-1 ; i > 0 ; --i){
			for(int j = 0; j < i ; ++j ){
				if(tableau[j] > tableau[j+1]){
					int temp = tableau[j];
					tableau[j] = tableau[j+1];
					tableau[j+1] = temp;
				}
			}
		}
		return tableau;
	}
	
}
