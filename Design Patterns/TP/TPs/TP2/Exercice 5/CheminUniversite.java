class CheminUniversite
{
	private Transport _transport;

	public CheminUniversite()
	{
		_transport = new CptMarche();
	}

	public CheminUniversite(Transport t)
	{
		_transport = t;
	}

	public Transport getTransport()
	{
		return _transport;
	}

	public void setTransport(Transport t)
	{
		_transport = t;
	}

	public void aller()
	{
		_transport.seDeplacer();
	}
}