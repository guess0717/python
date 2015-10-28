
package com.anna.park;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class Cars {
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	Map<String, String> map = new HashMap<>();
	String carid,enter,leave;
	int totaltime;
	
	public void carEnter(String carid,String enter){
		map.put(carid, enter);
	}
	
	public int carLeave(String carid,String leave){
		long in,out;
		if (map.containsKey(carid)){
			try {
				in = sdf.parse(map.get(carid)).getTime();
				out = sdf.parse(leave).getTime();
				totaltime = (int)((out - in)/1000/60);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}else{
			System.out.println ("沒有你的進場資料，請洽管理員");
		}
		return totaltime;
		
	}
}
