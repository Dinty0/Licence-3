import java.util.*;
import java.text.*;

class FormatIntl implements DateFormatStrat
{
  private DateFormat dateFormat;

  public FormatIntl()
  {
    dateFormat = new SimpleDateFormat( "yyyy-MM-dd" );
  }

  public String formatStrat( Date date )
  {
    return dateFormat.format( date );
  }
}