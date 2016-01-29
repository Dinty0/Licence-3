package tp8;

public abstract class Billeterie {
	private static Billeterie billeterie;
	private static int nbBillet;
	
	private Billeterie(){
		this.nbBillet = 0;
	}
	
	public abstract Billeterie  makeBilleterie();
	
	public Billeterie getBilleterie(){
		if(billeterie == null){
			synchronized (Piou.class) {
				if(billeterie == null){
					billeterie = makeBilleterie();
				}
			}
		}else{
			nbBillet = nbBillet + 1;
		}
		return billeterie;
	}
	

}
