import java.awt.*;

class MyFrameAWT extends Frame implements MyFrame
{
  TextArea txt = new TextArea();

  public MyFrameAWT(String s) 
  {
    setLayout(null);
 
    txt.setBounds(3, 3, 300, 200);
    add(txt);
 
    Font font = new Font("Verdana", Font.BOLD, 12);
    txt.setFont(font);
    txt.setForeground(Color.BLUE);
 
    txt.setText(s);
  }

  public void affiche()
  {
    this.show();
  }

  public void setSize(int x, int y)
  {
    super.setSize(x, y);
  }

  public void setTitle(String s)
  {
    super.setTitle(s);
  }
}
