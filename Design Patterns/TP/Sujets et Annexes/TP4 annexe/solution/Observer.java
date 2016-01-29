import java.text.*;
import java.util.*;

abstract class Observer
{
  protected Date date;
  protected Sujet sujet;
  protected DateFormat dateFormat;

  public Observer( Sujet s )
  {
    sujet = s;
    sujet.ajoutObs( this );
    dateFormat = new SimpleDateFormat( "HH:mm:ss" );
  }

  public void update( Date date )
  {
    this.date = date;
    System.out.println( dateFormat.format( date ) );
  }
}
