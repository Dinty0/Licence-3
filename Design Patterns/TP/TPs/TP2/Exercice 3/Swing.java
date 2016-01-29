import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class Swing extends JFrame implements MyFrame
{
	private JTextArea txt = new JTextArea();

	public Swing(String s)
	{
		setLayout(null);
		txt.setBounds(3,3,300,200);
		add(txt);
		Font font = new Font("Verdana", Font.BOLD, 12);
		txt.setFont(font);
		txt.setForeground(Color.BLUE);

		txt.setText(s);

	}
}