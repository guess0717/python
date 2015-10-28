package com.anna;

import java.util.Scanner;

public class Sales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sum = 0 ;
		int n = 0;
		while ( n >=0){
			System.out.println("請輸入銷售金額");
			String s = scanner.nextLine();
			try {
				n = Integer.parseInt(s);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("金額格式錯誤，請重新出入");
				continue;
			}
			if ( n <0)
				break;
			sum = sum + n ;
			System.out.println(sum);
			
		}

	}

}
