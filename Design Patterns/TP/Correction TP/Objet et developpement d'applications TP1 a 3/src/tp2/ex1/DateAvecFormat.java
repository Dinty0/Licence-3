package tp2.ex1;

import java.text.DateFormat;
import java.util.Date;

public class DateAvecFormat {
	private FormatDate formatDate;
	
	public DateAvecFormat(DateFormat date) {
		this.formatDate = new FormatUk(date);
	}

	public void setFormatDate(FormatDate formatDate) {
		this.formatDate = formatDate;
	}
	
	public FormatDate getFormatDate() {
		return this.formatDate;
	}
	
}
