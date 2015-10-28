package com.anna;

public class SwitchTester {

	public static void main(String[] args) {
		int score = 75;
		//System.out.println(score/10);
		String grade = "";
		switch (score/10){
		case 10:
			grade = "A+";
			break;
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
		}
		System.out.println(grade);
	}

}
