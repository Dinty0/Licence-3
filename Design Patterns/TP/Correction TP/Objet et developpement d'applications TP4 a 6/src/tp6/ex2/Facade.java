package tp6.ex2;

public class Facade {
	/*private VideoProjecteur vp;
	private Ordi ordi;
	private Multiprises mtp;
	private Salle salle;*/
	
	public void allumer(VideoProjecteur vp, Ordi ordinateur, Multiprises mp, Salle salle){
		salle.allumerLumiere();
		mp.brancheMulti();
		ordinateur.brancherOrdi(mp);
		ordinateur.allumerOrdi();
		vp.brancheVP(mp);
		vp.relierVP(ordinateur);
		vp.allumerVP();
	}
	
	public void eteindre(VideoProjecteur vp, Ordi ordinateur, Multiprises mp, Salle salle){	
		ordinateur.eteindreOrdi();
		ordinateur.debrancherOrdi(mp);
		vp.eteindreVP();
		vp.debrancherVP(mp);
		mp.debrancherMulti();
		salle.eteindreLumiere();
	}

}
