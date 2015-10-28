package com.anna.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

public class MySqlTester {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			try {
				//host,database,user,password
				Connection conn = DriverManager.getConnection("jdbc:mysql://j.snpy.org/java1?" +
				        "user=java1&password=jjaa989");
				//產生下指令的方法
				Statement stmt =  conn.createStatement();
				//查詢 parking 表格，res 不代表已經讀到資料，而是在資料的前一行，所以要用 re.next() 開始往下讀
				ResultSet res =  stmt.executeQuery("select * from parking");
				//新增資料進表，若要接變數，則要在 value 那邊加上 ' "+變數名稱+" '
				//String  in = ( " INSERT  INTO  parkinglot (index ,index)  VALUES( ' "+變數名稱+" ',' "+變數名稱+" ')  ");
				//利用 executeUpdate insert,update,delet 資料
				//stmt.executeUpdate(in);
				while(res.next()){
					//形態要與資料庫相同
					int id = res.getInt("id");
					String car_id = res.getString("car_id");
					//拿到時間
					Timestamp ts =  res.getTimestamp("ctime");
					//date 要 import java.util，不是 sql 的
					Date d = new Date(ts.getTime());
					int type = res.getInt("type");
					
					
					System.out.println(id+"/"+car_id+"/"+d+"/"+type);
					//System.out.println(d);
					//System.out.println(ts);
	
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//以下三個 catch 若有錯代表 driver 設定有問題
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//以下若有錯代表連線有問題
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
