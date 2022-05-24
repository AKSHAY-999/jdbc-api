
import java.sql.Connection;

import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;


public class ConnectionDemo  {
	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/ibm";
		
		//Registering driver withDriver manager
		DriverManager.registerDriver(new Driver());
		Connection conn=DriverManager.getConnection(url,"root","akshay@999");
		System.out.println("Connected Succesfully.......");
		
	}

}
