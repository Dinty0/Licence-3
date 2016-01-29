package tp2.ex4;

public class Client {
	
	public static void main(String[] args) {
		Roi joeffreyBaratheon = new Roi( new ComportementArc());
		Reine cerseiLannister = new Reine( new ComportementHache());
		Chevalier lorasTyrell = new Chevalier( new ComportementEpee());
		MarcheurBlanc whity = new MarcheurBlanc( new ComportementPoignard());
		
		joeffreyBaratheon.combattre();
		cerseiLannister.combattre();
		lorasTyrell.combattre();
		whity.combattre();
		
		whity.setArme( new ComportementHache());
		whity.combattre();
		
		System.out.println("ET A LA FIN TOUT LE MONDE MEURS. FIN !!! NIARK!");
		System.out.println("et personne n'a vue les fautes d'orthographes CAR ILS SONT MORTS");
	}
}
