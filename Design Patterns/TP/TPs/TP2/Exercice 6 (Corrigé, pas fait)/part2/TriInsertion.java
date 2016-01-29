package tp2.ex6.part2;

public class TriInsertion implements Tri {
	public int[] tri(int[] tableau) {
		for(int i = 1; i < tableau.length; i++) {
			int valueToSort = tableau[i];
			int j = i;
			while (j > 0 && tableau[j - 1] > valueToSort) {
				tableau[j] = tableau[j - 1];
				j--;
			}
			tableau[j] = valueToSort;
		}
		return tableau;
	}
}
