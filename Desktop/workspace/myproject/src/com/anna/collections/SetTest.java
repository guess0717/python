package com.anna.collections;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(10);
		set.add(9);
		set.add(1);
		
		for (int n : set){
			System.out.println ("*"+n);
		}
		
		System.out.print(set);
		

	}

}
