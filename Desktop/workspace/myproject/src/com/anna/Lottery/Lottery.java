package com.anna.Lottery;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class Lottery {
	
	public void ran(){
		int x ;
		Set<Integer> set = new HashSet<>();
		Random ran = new Random();
		while ( set.size() < 5 ){
			set.add ( x = ran.nextInt(39)+1);
		}
		System.out.println(set);

	}
	
	public static void main(String[] args) {
		Lottery lo = new Lottery();
		lo.ran();
		

	}

}
