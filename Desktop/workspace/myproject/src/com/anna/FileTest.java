package com.anna;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
	

	public static void main(String[] args) {
		//readFile2();
		try {
			FileReader fr = new FileReader("data.txt");
			//BufferedReader 讀一行，遇到斷行會停止
			BufferedReader in = new BufferedReader(fr);
			String s = in.readLine();
			//System.out.println(s);
			//String 讀不到會出 null
			while ( s != null ){
				System.out.println (s);
				s = in.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	private static void readFile2() {
		//readFile1();
		try {
			FileReader in = new FileReader("data.txt");
			//char 讀不到會出 -1
			char [] buf = new char[255];
			int len = in.read(buf);
			System.out.println (len);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void readFile1() {
		//writeTest();
		try {
			FileReader in = new FileReader("data.txt");
//			System.out.println (in.read());
//			System.out.println (in.read());
//			System.out.println (in.read());
//			System.out.println (in.read());
			
			int n = in.read();
			//不確定次數用 while 迴圈
			while ( n != -1 ){
				System.out.println (n);
				n = in.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void writeTest() {
		// TODO Auto-generated method stub
		try {
			FileWriter out = new FileWriter("data.txt");
			//寫檔案，但還不會實際寫入，必須要加上 flush 才會真正把檔案寫入
			out.write("你好");
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
