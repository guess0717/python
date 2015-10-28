package com.anna.park;


public class Car {

	public static void main(String[] args) {
		CarTime ct = new CarTime();
		int totaltime= ct.CarTime("2015-10-14 19:00", "2015-10-14 20:55", "QX-123");
		//System.out.println( " totaltime :"+totaltime );
		Rate rt = new Rate();
		int rate = rt.rate( totaltime );
		//System.out.println("rate :"+rate);
	}

}
