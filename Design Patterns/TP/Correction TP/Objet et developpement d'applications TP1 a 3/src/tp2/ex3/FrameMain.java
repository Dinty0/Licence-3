package tp2.ex3;

public class FrameMain {
	private MyFrame myFrame;
	
	public FrameMain (String s){
		this.myFrame = new MyFrameSwing(s);
	}
	
	public void setAffichage(MyFrame f){
		this.myFrame = f;
	}
	
	public void show(){
		myFrame.show();
	}
	
	public void setSize(int x, int y){
		myFrame.setSize(x , y);
	}
	
	public void setTitle(String s){
		myFrame.setTitle(s);
	}
}
