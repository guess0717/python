package traning;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CarTime {
	static String strDate;
	public static String times() {
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = new Date();
		//取得目前時間 xxxx-xx-xx xx:xx:xx
		strDate = sdFormat.format(date);
		return strDate;
	}
	
}
