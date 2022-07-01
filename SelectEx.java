import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// loading driver class database
		Class.forName("com.mysql.cj.jdbc.Driver");
		// create Db connection username and pwd url 3306
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onmobile?useSSL=false", "root",
				"rpsconsulting");
		// create statement
		Statement stmt = conn.createStatement();
		// execute querys ddl-execute(),dml-excuteupdate(),DRL-->executeQuery

		ResultSet rs = stmt.executeQuery("select * from onmobilemps");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString("ename") );
		}
		
		// close the connection
		conn.close();
		
	}

}
