
public class Paragraphe {
	
	private String c;
	
	public Paragraphe(String c){
		this.c=c;
	}
	
	public String getC(){
		return this.c;
	}

	public void afficher(){
		System.out.println(c);
	}
	
	public int nombreCaracteres(){
		return c.length();
	}
	
	public int occurence(char l){
		int cpt = 0;
		for (int i=0; i<c.length(); i++){
			if (l==c.toLowerCase().charAt(i)){
				cpt+=1;
			}
		}
		return cpt;
	}
	
	public int nombreCaracteresPonct(){
		int cpt = 0;
		for (int i=0; i<c.length(); i++){
			if ((c.charAt(i)=='.')||(c.charAt(i)==',')||(c.charAt(i)==';')||(c.charAt(i)==':')||(c.charAt(i)=='!')||(c.charAt(i)=='?')){
				cpt+=1;
			}
		}
		return cpt;
	}
	
	
	
}
