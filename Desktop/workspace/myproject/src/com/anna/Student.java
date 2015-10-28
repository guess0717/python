package com.anna;

public class Student {
	int chinese ;
	int english ;
	int math ;
	static int pass = 60;
	
	public Student (int chinese,int english ,int math){
		this.chinese = chinese;
		this.english = english;
		this.math = math;
		
	}
	
	public float average(){
		float avg = (chinese+english+math)/3;
		return avg;
	}
	
	public void report(){
		String star = "";
		if (average()<pass){
			star = "*";
		}
		System.out.println(english+"\t"+chinese+"\t"+math+"\t"+average()+star);
	}
	
	public static void main(String[] args) {
		
		Student stu1 = new Student(66, 77, 88);
		Student stu2 = new Student(68, 33, 51);
		Student stu3 = new Student(90, 94, 97);
		GraduateStudent stu4 = new GraduateStudent(70, 30, 88, 90);
		//System.out.println(stu1.pass);
		
		
		//System.out.println(stu1.pass);
		//System.out.println(stu2.pass);
		
		stu1.report();
		stu2.report();
		stu3.report();
		stu4.report();
		
		
		
		// TODO Auto-generated method stub
		//Student anna = new Student (20,100,100);
		//System.out.println(anna.average());
		



	}

}
