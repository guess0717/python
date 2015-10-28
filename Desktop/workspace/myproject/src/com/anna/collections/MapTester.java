package com.anna.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTester {

	public static void main(String[] args) {
		Map<String , String> map = new HashMap<>();
		map.put("1982", "Anna");
		map.put("1985", "carol");
		System.out.println(map);
		System.out.println(map.size());
		Set<String> keys = map.keySet();
		for (String Key : keys){
			System.out.println (Key);
			System.out.println (map.get(Key));
		}
		System.out.println(map.get("1982"));
		if (map.containsKey("2330")){
			
		}
		if (map.get("2330")!=null){
			
		}
		
		
		

	}

}
