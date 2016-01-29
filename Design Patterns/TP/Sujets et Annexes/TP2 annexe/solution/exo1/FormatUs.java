import java.util.*;
import java.text.*;

class FormatUs implements DateFormatStrat
{
  private DateFormat dateFormat;

  public FormatUs()
  {
    dateFormat = DateFormat.getDateInstance( DateFormat.SHORT, Locale.US );
  }

  public String formatStrat( Date date )
  {
    return dateFormat.format( date );
  }
}