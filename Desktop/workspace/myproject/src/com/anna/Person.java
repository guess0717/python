package com.anna;

import java.util.Scanner;

public class Person {
	//定義變數
	float weight;
	float height;
	float bmi;
	
	
	public Person(float w , float h){
		weight = w;
		height = h;
		
	}
	
	//計算公式
	public float bmi(){
		float bmi = weight/(height*height);
		return bmi;
	}
	
	public void advices(){
		if ( bmi < 17){
			System.out.println("你太瘦了");
		}else{
			if ( bmi >= 18.5 && bmi <=24 ){
				System.out.println("正常");
			}else{
				System.out.println("死胖子");
			}
			
		}
	}

	
	public void sayhello(){
		System.out.println("Hello World");
	
	}
	
	

	@Override
	public String toString() {
		return weight + "/" + height;
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in); 
		System.out.println("姓名");
		String name = scanner.nextLine();
		System.out.println(name+"您好");
		
		System.out.println("身高");
		float height = scanner.nextFloat();
		System.out.println(height);
		
		System.out.println("體重");
		float weight = scanner.nextFloat();
		System.out.println(weight);
		
		Person p = new Person(weight, height);
		System.out.println (p.bmi());
		
		p.advices();
		
		System.out.println(p);
		
		
		
		/*
		Person p = new Person(48.5f, 1.56f);
		System.out.println(p.bmi());
		p.sayhello();
		p.weight = 45.8f;
		p.height = 1.56f; //公尺
		
		
		
		float w = 46.2f ;
		float h = 1.56f ; // 公尺
		float bmi = w / (h*h);
		System.out.println(bmi);
			*/
		
	}

}
