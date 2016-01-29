
class PlageFreq {

	private int freqMin_;
	private int freqMax_;

	public PlageFreq(int min, int max)
	{
		freqMin_ = min;
		freqMax_ = max;
	}

	public int getFreqMin()
	{
		return freqMin_;
	}

	public int getFreqMax()
	{
		return freqMax_;
	}

	public int largeur()
	{
		return (freqMax_-freqMin_);
	}

	public int compareTo(PlageFreq plage) {
		return (int) Math.signum(this.largeur() - plage.largeur());
	}
}