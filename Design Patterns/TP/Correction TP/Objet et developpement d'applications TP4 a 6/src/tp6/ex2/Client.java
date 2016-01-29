package tp6.ex2;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Prof piou = new Prof(new Facade(), new VideoProjecteur("Uber VP"), new Ordi("Ventilo"), new Multiprises("Multiprise OF DOOM"), new Salle("TD 1"));
		piou.debutCour();
		System.out.println("");
		System.out.println("");
		try {
		    Thread.sleep(2500);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		piou.finCour();
	}

}
