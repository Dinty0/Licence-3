package tp2.ex3;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JTextArea;

public class MyFrameAWT extends Frame implements MyFrame {
	private JTextArea txt = new JTextArea();
	
	public MyFrameAWT (String s){
		setLayout(null) ;
		this.txt.setBounds (3, 3, 300, 200);
		add(this.txt);
		Font font = new Font ( "Verdana" , Font.BOLD, 12);
		this.txt.setFont(font);
		this.txt.setForeground(Color.BLUE);
		this.txt.setText(s);
	}


}
