import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class MyFrameSwing extends JFrame implements MyFrame
{
  JTextArea txt = new JTextArea();

  public MyFrameSwing(String s) 
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
