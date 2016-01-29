class Intervale
{
  private int min_;
  private int max_;

  public Intervale(int min, int max)
  {
    min_ = min;
    max_ = max;
  }

  public int largeur() { return max_ - min_; }

  public int getMin() { return min_; }
  public int getMax() { return max_; }

  public void setMinMax(int min, int max)
  {
    min_ = min;
    max_ = max;
  }

  public String toString() { return "[" + min_ + "-" + max_ + "]"; }
}
