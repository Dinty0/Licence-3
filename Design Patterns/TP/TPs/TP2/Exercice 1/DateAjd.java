import java.text.*;
import java.util.*;

class DateAjd
{
	private FormatDate _format;

	public DateAjd()
	{
		_format = new DateInt();
	}

	public DateAjd(FormatDate format)
	{
		_format = format;
	}

	public FormatDate getFormat()
	{
		return _format;
	}

	public void setFormat(FormatDate format)
	{
		_format = format;
	}

	public void afficherDate()
	{
		_format.ecrireDate();
	}
}