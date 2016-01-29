import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JTextArea;

class Awt extends Frame implements MyFrame 
{
	private JTextArea txt = new JTextArea();
	
	public Awt(String s)
	{
		setLayout(null) ;
		this.txt.setBounds (3,3,300,200);
		add(this.txt);
		Font font = new Font ( "Verdana" , Font.BOLD, 12);
		this.txt.setFont(font);
		this.txt.setForeground(Color.BLUE);
		this.txt.setText(s);
	}

}