import java.util.*;
import java.text.*;

class FormatUk implements DateFormatStrat
{
  private DateFormat dateFormat;

  public FormatUk()
  {
    dateFormat = DateFormat.getDateInstance( DateFormat.SHORT, Locale.UK );
  }

  public String formatStrat( Date date )
  {
    return dateFormat.format( date );
  }
}