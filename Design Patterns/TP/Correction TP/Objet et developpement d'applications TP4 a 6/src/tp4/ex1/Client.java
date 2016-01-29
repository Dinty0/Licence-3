package tp4.ex1;

import java.util.Date;

public class Client {
	public static void main(String[] args) {
		SujetDate sD = new SujetDate(new Date());
		Horloge horloge = new Horloge(sD);
		horloge.actualiser(sD.getDate());
		
		for(int i = 0; i<5; ++i){
			sD.setDate(new Date());
			horloge.afficher();
			try {
				Thread.sleep(1000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
		
	}
}

