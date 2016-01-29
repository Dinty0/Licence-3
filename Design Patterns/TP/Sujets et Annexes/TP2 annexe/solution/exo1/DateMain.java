import java.io.*;
import java.util.*;

public class DateMain
{
  static public void main(String[] args)
  {
    DateFormatStrat dateFormat;
    Date date = new Date();

    dateFormat = new FormatUk();
    System.out.println( "Aujourd'hui en UK : " + 
			dateFormat.formatStrat( date ) );

    dateFormat = new FormatUs();
    System.out.println( "Aujourd'hui en US : " + 
			dateFormat.formatStrat( date ) );

    dateFormat = new FormatIntl();
    System.out.println( "Aujourd'hui dans le monde : " + 
			dateFormat.formatStrat( date ) );
  }
}