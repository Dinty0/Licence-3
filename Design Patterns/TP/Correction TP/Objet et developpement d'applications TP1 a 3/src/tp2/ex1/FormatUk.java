package tp2.ex1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatUk implements FormatDate{
	private DateFormat date;
	
	public FormatUk(DateFormat d){
		this.date = DateFormat.getDateInstance(d.LONG, Locale.UK);
	}

	public void setFormatDate(DateFormat d) {
		this.date = DateFormat.getDateInstance(d.LONG, Locale.UK);
	}

	public DateFormat getDate() {
		return date;
	}
	
	
}
