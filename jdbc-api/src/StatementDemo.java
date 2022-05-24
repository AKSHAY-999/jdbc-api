import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql="insert into person values('Jack',19,'jaipur')";
		
		try {
			Connection conn=JdbcFactory.getConnection();
			Statement stmt=conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("record inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
