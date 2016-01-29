package tp8;

public class  Piou {
	private static Piou piou;
	private static int nbPiou;
	
	private Piou(){
		this.nbPiou = 0;
	}
	
	public static Piou getPiou(){
		if(piou == null){
			System.out.println("Piou ?");
			synchronized (Piou.class) {
				System.out.println("Piou ? synchronoized ?");
				if(piou == null){
					piou = new Piou();
					System.out.println("New Piou !");
				}
			}
		}else{
			nbPiou = nbPiou + 1;
			System.out.println("Piou ! - nbPiou = " + nbPiou);
		}
		return piou;
	}

}
