
class Position {

	private double lon_;
	private double lat_;

	public Position(double x, double y)
	{
		lon_ = x;
		lat_ = y;
	}

	public double getLon()
	{
		return lon_;
	}

	public double getLat()
	{
		return lat_;
	}
}