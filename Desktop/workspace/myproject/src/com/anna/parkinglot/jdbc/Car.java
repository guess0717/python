package com.anna.parkinglot.jdbc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Car {
	public static final int TYPE_ENTER = 0;
	public static final int TYPE_LEAVE = 1;
	SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
	String id;
	String enter;
	
	//10/20 新增資料庫版本
	Date entertime;
	
	//10/20 新增資料庫版本
	public Car(String id, Date entertime) {
		super();
		this.id = id;
		this.entertime = entertime;
	}
	
	//10/20新增資料庫版本
	public int leave(Date leavetime) {
		int mins = (int)(leavetime.getTime() - entertime.getTime());
		return 0;
	}
	
	
}
