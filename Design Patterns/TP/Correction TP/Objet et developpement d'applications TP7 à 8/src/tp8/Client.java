package tp8;

public class Client {


	public static void main ( String[] args ) {
		Thread t1 = new Thread(new Multi()) ;
		Thread t2 = new Thread(new Multi()) ;
		// Lancer les threads
		t1.start();
		t2.start();

	}
}
