package com.anna.parkinglot.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

public class MySqlTester {
	public static void main(String[] args) {
		ParkingLot lot = new ParkingLot();
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			try {
				//host,database,user,password
				Connection conn = DriverManager.getConnection("jdbc:mysql://j.snpy.org/java1?" +
				        "user=java1&password=jjaa989");
				//產生下指令的方法
				Statement stmt =  conn.createStatement();
				//查詢 parking 表格，res 不代表已經讀到資料，而是在資料的前一行，所以要用 re.next() 開始往下讀
				ResultSet rs =  stmt.executeQuery("select * from parking");
				while(rs.next()){
					int id = rs.getInt("id");
					String carId = rs.getString("car_id");
					Timestamp ts = rs.getTimestamp("ctime");
					Date d = new Date(ts.getTime());
					int type = rs.getInt("type");
					System.out.println(id+"/"+carId+"/"+d+"/"+type);
					Car car = new Car(carId, d);
					if (type==car.TYPE_ENTER){
						lot.add(car);
					}else{
						int fee = lot.remove(carId, d);
						System.out.println("fee:"+fee);
					}
				}
				stmt.close();
				conn.close();
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
