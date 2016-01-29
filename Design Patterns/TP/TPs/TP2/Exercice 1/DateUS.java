import java.text.*;
import java.util.*;

class DateUS implements FormatDate
{
	public void ecrireDate()
	{
		Date date = new Date();
		DateFormat formatUs = DateFormat.getDateInstance(DateFormat .SHORT, Locale .US);
		String string = formatUs.format(date);

		System.out.println(string);
	}
}