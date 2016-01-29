import java.text.*;
import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		DateAjd ojd = new DateAjd();

		ojd.afficherDate();

		ojd.setFormat(new DateUK());
		ojd.afficherDate();

		ojd.setFormat(new DateUS());
		ojd.afficherDate();

		ojd.setFormat(new DateInt());
		ojd.afficherDate();
	}
}