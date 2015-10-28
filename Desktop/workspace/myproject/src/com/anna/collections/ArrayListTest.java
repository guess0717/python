package com.anna.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		// add is add int
		list.add(2);
		list.add(7);
		list.add(7);
		list.add(999);
		
		for ( int i = 0 ; i < list.size(); i++){
			System.out.println ("*" + list.get(i));
		}
		
		// foreach 迴圈 ( 有無 index 皆可使用此迴圈)
		for (int i : list){
			System.out.println ("$" + i);
		}
		
		
		// print list
		System.out.println (list);
		// 算出 list 存著幾個數字
		System.out.println (list.size());
		// 檢查 list 內是否有 6 這個數字
		System.out.println (list.contains(6));
		// 檢查 list 內是否有 2 這個數字
		System.out.println (list.contains(2));
		// 移除 list 內的 index 為 3 內的數字
		list.remove(3);
		// 移除後會發現 999 數字已消失
		System.out.println (list);
		list.clear();
		System.out.println (list);
		

	}

}
