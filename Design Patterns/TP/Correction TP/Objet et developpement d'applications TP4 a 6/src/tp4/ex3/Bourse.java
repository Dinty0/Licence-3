package tp4.ex3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Vector;

public class Bourse implements Sujet {
	private Vector<Observeur> observeurs;
	private URL url;
	private double cac40; 
	private double nikkei; 
	private double nasdaq;
	
	public Bourse() {
		this.observeurs = new Vector<Observeur>();
        try{
        	this.url = new URL("http://finance.yahoo.com/d/quotes.csv?s=^FCHI+^IXIC+^N225&f=l1");
        }catch (Exception e){
				
        }
		try{
			this.setBourse();
		}catch (Exception e){
			
		}
	}

	public void ajouterObs(Observeur o) {
		this.observeurs.add(o);
	}

	public void supprimerObs(Observeur o) {
		this.observeurs.remove(o);
	}

	public void notifierObs() {
		for(Observeur o : this.observeurs){
			o.actualiser(cac40, nikkei, nasdaq);
		}
	}

	public void setBourse() throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(this.url.openStream()));
		Vector<String> inputLine = new Vector<String>();
		String tmp;
		while( ( tmp = in.readLine() ) != null ){
			inputLine.add( tmp );
		}
		in.close();
		this.cac40 = Double.parseDouble( inputLine.get(0) );;
		this.nikkei = Double.parseDouble( inputLine.get(1) );;
		this.nasdaq = Double.parseDouble( inputLine.get(2) );;
		this.notifierObs();
	}

}
