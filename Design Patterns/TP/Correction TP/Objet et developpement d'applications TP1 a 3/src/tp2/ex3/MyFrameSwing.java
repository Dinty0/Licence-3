package tp2.ex3;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame ;
import javax.swing.JTextArea;

public class MyFrameSwing extends JFrame implements MyFrame{
	private JTextArea txt = new JTextArea();
	
	public MyFrameSwing (String s){
		setLayout(null) ;
		this.txt.setBounds (3, 3, 300, 200);
		add(this.txt);
		Font font = new Font ( "Verdana" , Font.BOLD, 12);
		this.txt.setFont(font);
		this.txt.setForeground(Color.BLUE);
		this.txt.setText(s);
	}

}
