package tp2.ex1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FormatInter implements FormatDate{
	private DateFormat date;
	
	public FormatInter(DateFormat d){
		this.date = new SimpleDateFormat("yyyy-MM-dd");
	}
	
	public void setFormatDate(DateFormat d) {
		this.date = new SimpleDateFormat("yyyy-MM-dd");
	}
	public DateFormat getDate() {
		return date;
	}
	
}
