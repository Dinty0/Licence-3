import java.util.Vector;


public class Livre {
	
	private Titre titre;
	private Vector<Chapitre> vchap;
	
	public Livre (Titre t){
		this.titre=t;
		vchap = new Vector<Chapitre>();
	}
	
	public Livre (){
	    titre = new Titre("");
		vchap = new Vector<Chapitre>();
	}
	
	public Livre (String nomFichier){
		LecteurFichier lecteur = new LecteurFichier();
		if (lecteur.ouvrir(nomFichier)) {
		
		  // création du titre
		  String ligne = lecteur.lireLigne();
		  titre = new Titre(ligne);
		  
		  System.out.println("Titre : " + ligne);

		  vchap = new Vector<Chapitre>();
		  
		  while ((ligne = lecteur.lireLigne()) != null) {			  
			  if(!ligne.equals("")) {
				  if((ligne.length()>=8) && (ligne.substring(0, 8).equals("Chapitre"))) {
					  vchap.add(new Chapitre());
				  }
				  else{
					  vchap.get(vchap.size() -1).addParagraphe(new Paragraphe(ligne));
				  }
			  }
		  }
		  lecteur.fermer();
		}
		  
		  else {
			  System.out.println("erreur d'ouverture du fichier");
		  }
	}

	public void ajoutChap(Chapitre chapitre){
		vchap.add(chapitre);
	}
	
	public void afficher(){
		int i;
		for (i=0; i<vchap.size(); i++){
			System.out.println();
			System.out.println("Chapitre : "+(i+1));
			System.out.println();
			
			vchap.get(i).afficher();
		}
	}
	
	public int nombreChapitres(){
		return vchap.size();
	}
	
	public int nombreTotalParagraphes(){
		int i;
		int total = 0;
		for (i=0; i<vchap.size(); i++){
			total += vchap.get(i).nombreParagraphes();
		}
		return total;
	}
	
	public int nombreParagraphe(int i){
		return vchap.get(i-1).nombreParagraphes();
	}
	
	
	public int nombreCaracteres(){
		int i;
		int total = 0;
		for (i=0; i<vchap.size(); i++){
			total += vchap.get(i).nombreCaracteres();
		}
		return total;
	}
	
	public int occurence(char l){
		int i;
		int total = 0;
		for (i=0; i<vchap.size(); i++){
			total += vchap.get(i).occurence(l);
		}
		return total;
	}
	
	public int nombreCaracteresPonct(){
		int i;
		int total = 0;
		for (i=0; i<vchap.size(); i++){
			total += vchap.get(i).nombreCaracteresPonct();
		}
		return total;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Livre livre = new Livre("le_petit_prince.txt");
					
		System.out.println(livre.nombreChapitres());
		System.out.println(livre.nombreTotalParagraphes());
		System.out.println(livre.nombreParagraphe(1));
		System.out.println(livre.nombreCaracteres());
		System.out.println(livre.nombreCaracteresPonct());
		System.out.println(livre.occurence('.'));
		  
	}
}
