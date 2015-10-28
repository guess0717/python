package traning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ParkingLotDB {
	
	public void carInDB(String carid,String entertime){
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			try {
				//host,database,user,password
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/java?" +
				        "user=root&password=aa1234");
				//產生下指令的方法
				Statement stmt =  conn.createStatement();
				stmt.executeUpdate( " INSERT  INTO  parkinglot (car_id ,entertime)  VALUES( ' "+carid+" ',' "+entertime+" ')  ");
				//以下三個 catch 若有錯代表 driver 設定有問題
			} catch (SQLException e) {
				e.printStackTrace();
			}
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
				//以下若有錯代表連線有問題
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void carOutDB(String carid,String leavetime){
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			try {
				//host,database,user,password
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/java?" +
				        "user=root&password=aa1234");
				//產生下指令的方法
				Statement stmt =  conn.createStatement();
				stmt.executeUpdate(" UPDATE parkinglot SET leavetime = ' "+leavetime+" ' WHERE car_id = ' "+carid+" ' ");
				//以下三個 catch 若有錯代表 driver 設定有問題
			} catch (SQLException e) {
				e.printStackTrace();
			}
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
				//以下若有錯代表連線有問題
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}

	

