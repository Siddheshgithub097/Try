package jdbc_eb9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Program1 {
	public static void main(String[] args) throws Exception {
		//1.Load or Register Driver
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		//2.Establish Connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/std","root","Siddhesh@123");
		
		//3.Create Statement
		Statement statement=connection.createStatement();
		
		//4.Execute Statement
		statement.execute("INSERT INTO persondb VALUES (3,'RACHANA',96119452)");
		
		//5.Close
		connection.close();
	}
}
