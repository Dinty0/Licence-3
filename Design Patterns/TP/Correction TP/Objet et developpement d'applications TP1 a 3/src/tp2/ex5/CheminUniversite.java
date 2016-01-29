package tp2.ex5;

public class CheminUniversite {
	private Transport transport;
	
	public CheminUniversite(Transport t){
		this.transport = t;
	}
	
	public void aller(){
		this.transport.seDeplacer();
	}
	
	public void setTransport(Transport t){
		this.transport = t;
	}
}
