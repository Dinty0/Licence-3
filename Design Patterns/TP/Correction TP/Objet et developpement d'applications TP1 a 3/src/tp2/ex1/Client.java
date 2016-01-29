package tp2.ex1;
import java.text.*;
import java.util.*;

public class Client {

	public static void main(String[] args) {

		Date date = new Date();
		DateFormat d = new SimpleDateFormat();
		
		DateAvecFormat da = new DateAvecFormat(d);
		System.out.println(da.getFormatDate().getDate().format(date));
		
		da.setFormatDate(new FormatUs(d)); 		
		System.out.println(da.getFormatDate().getDate().format(date));
		
		da.setFormatDate(new FormatInter(d)); 
		System.out.println(da.getFormatDate().getDate().format(date));
		
	}

}
