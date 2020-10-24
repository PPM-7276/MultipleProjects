import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat_Demo {
		public static void main(String[] args) {
			Date date = new Date();
			String strDateFormat = "HH:mm:ss a";//formatting time to have AM/PM text using 'a' format
			SimpleDateFormat stf = new SimpleDateFormat(strDateFormat);
			//Date is predefined class in java.text package
			String DATE_FORMAT = "MM/dd/yyyy";
			SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
			System.out.println("Today's Date is := " +sdf.format(date) );
			System.out.println("Current system Time with AM/PM field := " + stf.format(date));
	}
}
