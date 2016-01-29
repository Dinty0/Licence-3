import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class FrameMain
{
	private MyFrame _myFrame;

	public FrameMain(String s)
	{
		_myFrame = new Swing(s);
	}

	public FrameMain(MyFrame m)
	{
		_myFrame = m;
	}

	public void show()
	{
		_myFrame.show();
	}

	public void setSize(int x, int y)
	{
		_myFrame.setSize(x,y);
	}

	public void setTitle(String s)
	{
		_myFrame.setTitle(s);
	}

	public void setAffichage(MyFrame m)
	{
		_myFrame = m;
	}

	public MyFrame getAffichage()
	{
		return _myFrame;
	}
}