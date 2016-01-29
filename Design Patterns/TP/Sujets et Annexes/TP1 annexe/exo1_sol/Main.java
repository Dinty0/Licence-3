import java.io.*;
import java.util.*;

class Main
{
  public static void main( String [] args )
  {
    Antenne antenne1 = new Antenne( 42, 123, 54.3, 20, 1000 );
    Antenne antenne2 = new Antenne( 24, 32.1, 77.8, 50, 1700 );

    System.out.println(antenne1 + ", largeur=" + antenne1.largeur());
    System.out.println(antenne2 + ", largeur=" + antenne2.largeur());

    System.out.println( "distance=" + antenne1.distance( antenne2 ) );

    SortedSet<Antenne> set = new TreeSet<Antenne>();
    set.add(antenne2);
    set.add(antenne1);
    set.add( new Antenne( 21, 98.7, 266.88, 25, 2700 ) );

    System.out.println( set );
  }
}
