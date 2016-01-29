
import java.lang.Math;
import java.lang.String;

class Antenne {

	private int id_;
	private Position pos_;
	private PlageFreq plage_;

	public Antenne(int idt, Position po, PlageFreq pla)
	{
		id_ = idt;
		pos_ = po;
		plage_ = pla;
	}

	public Antenne(int idt, Position po, int fmin, int fmax)
	{
		id_ = idt;
		pos_ = po;
		plage_ = new PlageFreq(fmin,fmax);
	}

	public Antenne(int idt, double lo, double la, int fmin, int fmax)
	{
		id_ = idt;
		pos_ = new Position(lo,la);
		plage_ = new PlageFreq(fmin,fmax);
	}

	public int getId()
	{
		return id_;
	}

	public Position getPos()
	{
		return pos_;
	}

	public PlageFreq getPlage()
	{
		return plage_;
	}

	public String toString()
	{
		return (id_+":["+plage_.getFreqMin()+"-"+plage_.getFreqMax()+"]@("+pos_.getLon()+","+pos_.getLat()+")");
	}

	public double distAntennes(Antenne a2)
	{
		double a = (a2.getPos().getLon() - pos_.getLon()) * (a2.getPos().getLon() - pos_.getLon());
		double b = (a2.getPos().getLat() - pos_.getLat()) * (a2.getPos().getLat() - pos_.getLat());
		return (Math.sqrt(a+b));
	}

	public double largeurPlage()
	{
		return plage_.largeur();
	}
}