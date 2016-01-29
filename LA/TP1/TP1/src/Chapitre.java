import java.util.Vector;

public class Chapitre {
	
	
	private Vector<Paragraphe> vpar;
	
	
	public Chapitre(){
		vpar = new Vector<Paragraphe>();
	}
	
	public void addParagraphe(Paragraphe p){
		vpar.add(p);
	}
	
	public Vector<Paragraphe> getParagraphe(){
		return(vpar);
	}
	
	public void afficher(){
		int i;
		for (i=0; i<vpar.size(); i++){
			System.out.println();
			vpar.get(i).afficher();
		}
	}
		
	public int nombreParagraphes(){
		return vpar.size();
	}
	
	public int nombreCaracteres(){
		int i;
		int total = 0;
		for (i=0; i<vpar.size(); i++){
			total += vpar.get(i).nombreCaracteres();
		}
		return total;
	}
	
	public int occurence(char l){
		int i;
		int total = 0;
		for (i=0; i<vpar.size(); i++){
			total += vpar.get(i).occurence(l);
		}
		return total;
	}
	
	public int nombreCaracteresPonct(){
		int i;
		int total = 0;
		for (i=0; i<vpar.size(); i++){
			total += vpar.get(i).nombreCaracteresPonct();
		}
		return total;
	}
	
		
}