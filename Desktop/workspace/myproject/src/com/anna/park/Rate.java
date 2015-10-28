package com.anna.park;

public class Rate  {
	 // 一小時 30，半小時 15
	int onehour = 30;
	int halfhour = 15;
	int rate;
	public int rate( int totaltime){
		if( totaltime % onehour == 0){
			rate = ( totaltime / onehour ) * halfhour;
			System.out.println ( " 應付: " + rate + "元" );
		}else{
			rate = ( ( totaltime / onehour ) + 1 ) * halfhour;
			System.out.println ( " 應付: " +  rate + "元" );
			
		}
		return rate;
	}
}
