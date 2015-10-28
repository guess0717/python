package com.anna;

public class GraduateStudent extends Student {
	
	int thisis;
	static int pass = 70;
	
	public GraduateStudent(int chinese, int english, int math , int thisis) {
		// super 為呼叫 Student 的建構子
		super(chinese, english, math);
		this.thisis = thisis;
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void report() {
		// TODO Auto-generated method stub
		String star = "";
		if (average()<pass){
			star = "*";
		}
		System.out.println(english+"\t"+chinese+"\t"+math+"\t"+average()+star+"\t"+thisis);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
