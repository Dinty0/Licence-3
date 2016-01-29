package tp2.ex1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatUs implements FormatDate{
	private DateFormat date;
	
	public FormatUs(DateFormat d){
		this.date = DateFormat.getDateInstance(d.SHORT, Locale.US);
	}

	public void setFormatDate(DateFormat d) {
		this.date = DateFormat.getDateInstance(d.SHORT, Locale.US);
	}
	
	public DateFormat getDate() {
		return date;
	}
	

}
