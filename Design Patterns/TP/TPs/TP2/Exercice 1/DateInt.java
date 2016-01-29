import java.text.*;
import java.util.*;

class DateInt implements FormatDate
{
	public void ecrireDate()
	{
		Date date = new Date();
		DateFormat formatInt = new SimpleDateFormat("yyyy-MM-dd");
		String string = formatInt.format(date);

		System.out.println(string);
	}
}