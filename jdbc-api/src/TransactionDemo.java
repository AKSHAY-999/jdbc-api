import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {
	public static void main(String[] args) {
		String sql1="insert into person values('Glen',22,'Goa')";
		String sql2="update person set age=22 where name='Polo')";
		String sql3="delete from person ehere nam='Polo')";
		
		try {
			Connection conn=null;
			conn=JdbcFactory.getConnection();
			conn.setAutoCommit(false);
			Statement stmt=conn.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			stmt.executeBatch();
			conn.commit();
			System.out.println("transaction succesfully complted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("transaction failed due to");
			e.printStackTrace();
			try {
				conn.rollback();
				
				
			}catch(SQLException e1){
				e1.printStackTrace();
			}
		}
		
	}

}
