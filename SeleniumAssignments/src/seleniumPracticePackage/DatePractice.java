package seleniumPracticePackage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePractice {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		String pattern= "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat SimpleDateFormat=new SimpleDateFormat(pattern); 
		String date=SimpleDateFormat.format(d);
		System.out.println(date);
		date=date.replace(":", "-");
		System.out.println(date);
	}

}
