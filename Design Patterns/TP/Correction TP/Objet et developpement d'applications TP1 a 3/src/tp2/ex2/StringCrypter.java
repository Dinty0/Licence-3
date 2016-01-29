package tp2.ex2;

import java.security.MessageDigest;

public class StringCrypter {
	private String stringCrypter;
	private Digesteur Digesteur;
	
	public StringCrypter(String s, Digesteur d) {
		this.Digesteur = d;
	//	MessageDigest.getInstance(this.Digesteur.getNomDigesteur());
	//	this.stringCrypter = new String(MessageDigest.digest(s.getBytes()));
	}
	
	public void setCryptage(Digesteur d){
		this.Digesteur = d;
	}
	
	//public void 
	
}
