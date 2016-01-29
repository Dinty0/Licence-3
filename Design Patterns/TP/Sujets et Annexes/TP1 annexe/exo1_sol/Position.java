class Position
{
  private double x_, y_;
  
  public Position()
  {
    x_ = y_ = 0;
  }

  public Position( double x, double y )
  {
    x_ = x;
    y_ = y;
  }

  public double getX() { return x_; }
  public double getY() { return y_; }

  public void setX( double x ) { x_ = x; }
  public void setY( double y ) { y_ = y; }

  public String toString() { return "(" + x_ + ", " + y_ + ")"; }
}
