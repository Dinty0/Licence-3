public class FrameMain 
{
  private MyFrame myFrame_;

  public void show()
  {
    myFrame_.affiche();
  }

  public void setSize(int x, int y)
  {
    myFrame_.setSize(x, y);
  }

  public void setTitle(String s)
  {
    myFrame_.setTitle(s);
  }
 
  public void setFrame(MyFrame myFrame)
  {
    myFrame_ = myFrame;
  }

  public static void main(String [] args) 
  {
    String mess = "Tapez votre texte ici :\n";
    FrameMain frame = new FrameMain();

    frame.setFrame(new MyFrameSwing(mess));
    frame.setSize(313,233);
    frame.setTitle("Changement de police");
    frame.show();
   }
}
