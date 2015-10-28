package com.tom.atm;

public class Racing2 {

	public static void main(String[] args) {
		HorseRunnable h1 = new HorseRunnable("H1");
		HorseRunnable h2 = new HorseRunnable("H2");
		Thread thr1 = new Thread(h1);
		Thread thr2 = new Thread(h2);
		thr1.start();
		thr2.start();
	}

}
