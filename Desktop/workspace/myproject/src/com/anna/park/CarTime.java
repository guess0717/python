package com.anna.park;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CarTime {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	int totaltime;
	String enter,leave,carid;
	
	public CarTime(){
		
	}
	
	public int CarTime (String enter,String leave,String carid){
		long checkin,checkout;
		try {
			System.out.println(" 進場時間 : " + enter);
			System.out.println(" 離場時間 : " + leave);
			System.out.println(" 車號 : " + carid);
			checkin = sdf.parse(enter).getTime();
			checkout = sdf.parse(leave).getTime();
			totaltime = (int) (( checkout - checkin ) / 1000 / 60);
			System.out.println(" 共停了 : " + totaltime + " 分鐘 ");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return totaltime;
	}

}
