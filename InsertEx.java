import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// loading driver class database
		Class.forName("com.mysql.cj.jdbc.Driver");
		// create Db connection username and pwd url 3306
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onmobile?useSSL=false", "root",
				"rpsconsulting");
		// create statement
		Statement stmt = conn.createStatement();
		// execute querys ddl-execute(),dml-excuteupdate(),DRL-->executeQuery

	//int result=	stmt.executeUpdate("insert into onmobilemps values(123,'sandeep')");

		//int result=	stmt.executeUpdate("update onmobilemps set ename='anvitha' where eid=123");
		int result=	stmt.executeUpdate("delete from onmobilemps");
		// close the connection
		conn.close();
		System.out.println("data updated ....."+result);
	}

}
