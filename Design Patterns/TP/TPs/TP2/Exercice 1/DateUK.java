import java.text.*;
import java.util.*;

class DateUK implements FormatDate
{

	public void ecrireDate()
	{
		Date date = new Date();
		DateFormat formatUk = DateFormat.getDateInstance(DateFormat .SHORT, Locale .UK);
		String string = formatUk.format(date);

		System.out.println(string);
	}
}