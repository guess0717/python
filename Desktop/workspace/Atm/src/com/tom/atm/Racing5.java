package com.tom.atm;

public class Racing5 {

	public static void main(String[] args) {
		new Thread(){

			@Override
			public void run() {
				//
				
			}
			
		}.start();
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				       
				//
			}
		};
		
		Runnable r2 = ()->{
			//
			System.out.println("haha");
		};
		Runnable r3 = ()-> System.out.println("haha");
		
	}

}
