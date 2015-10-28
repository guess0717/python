package com.anna.parkinglot.jdbc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ParkingLot {
	int rate = 30;
	Map<String, Car> map = new HashMap<>();
	
	public void add(Car c){
		map.put(c.id, c);
	}
	//10/20新增資料庫版本
	public int remove(String id, Date leaveTime){
		if (map.containsKey(id)){
			Car c = map.get(id);
			int mins = c.leave(leaveTime);
			return (int)Math.ceil(mins/60.0)*rate;
		}
		return 0;
	}
	
	
	
}