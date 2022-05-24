import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class JdbcFactory {
	public static Connection getConnection() throws Exception{
		String url="jdbc:mysql://localhost:3306/ibm";
		
		//Registering driver withDriver manager
		DriverManager.registerDriver(new Driver());
		Connection conn=DriverManager.getConnection(url,"root","akshay@999");
		return conn;
//		System.out.println("Connected Succesfully.......");
	}

}
