class Main
{

	public static void main(String[] args) {

		FrameMain frame = new FrameMain ( "Tapez votre texte ici :\n" ) ;
		frame.setSize(313, 233);
		frame.setTitle("Changement de police");
		frame.show();
		
		try {
		    Thread.sleep(5000);                 //1000 milliseconds is one second.
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		
		frame.setAffichage(new Awt("Tapez votre texte ici :\n"));
		frame.setSize(313, 233);
		frame.setTitle("Changement de police");
		frame.show();
	}
}