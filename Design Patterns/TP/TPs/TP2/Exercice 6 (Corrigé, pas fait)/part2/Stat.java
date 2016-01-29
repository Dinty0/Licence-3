package tp2.ex6.part2;

public class Stat {

	private int[] tableau;
	private Tri tri;

	public Stat(int[] tableau, Tri t) {
		this.tableau = tableau;
		this.tri = t;
	}
	
	public int getMaximum(){
		return this.tableau[this.tableau.length-1];
	}
	public int getMinimum(){
		return this.tableau[0];
	}
	
	public int getMedianne(){
		int medianne;
		this.tri.tri(this.tableau);
		if( (this.tableau.length % 2) != 0){
			medianne = this.tableau[(this.tableau.length-1)/2];  
		}else{
			medianne = (this.tableau[(this.tableau.length-1)/2] + this.tableau[((this.tableau.length-1)/2) + 1])/2;
		}
		return medianne;
	}
	
	public void setTri(Tri t){
		System.out.println("GOGO changement de Tri ,Yeah!");
		this.tri = t;
	}

	public int[] getTableau() {
		return tableau;
	}

	
}
