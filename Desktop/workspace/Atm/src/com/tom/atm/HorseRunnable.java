package com.tom.atm;

public class HorseRunnable implements Runnable {
	String name;
	public HorseRunnable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i=0;i<=5000;i++){
			System.out.println(name+":"+i);
		}
	}

}
