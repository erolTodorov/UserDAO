package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	
	public static void main(String[] args) {
	
	try {
	 Connection con = DriverManager.getConnection("jdbc:h2:~/test");
	 Statement stt = con.createStatement();
	 boolean createStt = stt.execute("Create table  studens(id INTIGER PRIMARY KEY, first_name VARCHAR(40), not null");
	 ResultSet rs = stt.executeQuery("select * from studens;");
	 con.close();
	} catch(SQLException e) {
		e.printStackTrace();
		
	} 
	}
}
