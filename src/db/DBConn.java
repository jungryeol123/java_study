package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConn {
	//Field
	private String url = "jdbc:mysql://127.0.0.1:3306/hrdb2019";
	private String user = "root";
	private String password = "mysql1234";
	
	Connection connection;
	protected PreparedStatement pstmt;
	protected Statement stmt;
	protected ResultSet rs;
	
	//Constructor
	protected DBConn() {
		try {
			//1, 2 단계
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("-----> 1단계 성공!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Method
	
	//Statement 생성
	public void getPreparedStatement(String sql) {
		try {
			//2단계 : Statement 객체 생성
			pstmt = connection.prepareStatement(sql);
			System.out.println("-----> 2단계 성공!!");
			
		} catch (Exception e) {
			e.printStackTrace();
	  }
//		return stmt;
		
	}
	
	//close
	
	public void close() {
		try {
			if(rs != null) rs.close();
			if(stmt != null) stmt.close();
			if(connection != null) connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
