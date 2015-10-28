package com.anna.Lottery;

import java.nio.channels.ReadableByteChannel;
import java.util.Random;

 

public class Lottery539Game {
	int[] numbers = new int[5];
	
	public Lottery539Game() {
		
	}
	
	public Lottery539Game(int n1, int n2 ,int n3, int n4, int n5) {
		numbers[0]=n1;
		numbers[1]=n2;
		numbers[2]=n3;
		numbers[3]=n4;
		numbers[4]=n5;
	}
	
	public void generate(){
		Random r = new Random();
		for (int i=0; i<5 ; i++){
			// nextInt 是隨機產生範圍內的數字
			numbers[i] = r.nextInt(39)+1;
		}
		
	}
	
	public boolean validate(){
		boolean valid = false;
		int[] data = new int[40];
		int count = 0;
		for (int i=0; i<5; i++){
			if (data[numbers[i]] == 0){
				data[numbers[i]] = 1;
				count = count +1;
			}
		}
		if (count == 5)
			valid = true;
		
		return valid;
	}
	

	
	public static void main(String[] args) {
		Lottery539Game lot = new Lottery539Game(1, 3, 7, 8, 9);
		System.out.println(lot.validate());
	
	
		// TODO Auto-generated method stub
		/*
		Random r = new Random();
		// 代表 0 <= 3
		int [] n = new int[5];
		for (int i=0;i<5;i++){
			n[i] = r.nextInt(39)+1;
			System.out.println(n[i]);
		*/
		}
	}

