package com.anna.park;

public class Rates {
	int onehour = 30;
	int halfhour = 15;
	int rate;
	
	public int rates(int totaltime){
		if( totaltime % onehour == 0){
			rate = ( totaltime / onehour ) * halfhour;
			System.out.println ( " 應付: " + rate + "元" );
		}else{
			rate = ( (totaltime / onehour ) + 1 ) * halfhour;
			System.out.println ( " 應付: " +  rate + "元" );
		}
		return rate;
	}
	
	public static void main(String[] args) {
		Cars aparking = new Cars();
		Rates arates = new Rates();
		aparking.carEnter("1136-QX", "2015-10-18 21:00");
		int totaltime = aparking.carLeave("1136-QX", "2015-10-18 22:29");
		arates.rates(totaltime);
	}
	
}
