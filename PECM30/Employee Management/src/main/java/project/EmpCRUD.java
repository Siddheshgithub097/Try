package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpCRUD 
{
	public Connection getConnection() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp1?user=root&password=root");
		return connection;
	}
	
	public int  signup(Emp emp) throws Exception {
		
	   Connection connection=getConnection();
	   
	   PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO EMP VALUES(?,?,?,?,?,?)");
	   preparedStatement.setInt(1,emp.getId());
	   preparedStatement.setString(2,emp.getName());
	   preparedStatement.setLong(3,emp.getPhone());
	   preparedStatement.setString(4,emp.getAddress());
	   preparedStatement.setString(5,emp.getEmail());
	   preparedStatement.setString(6,emp.getPassword());
	   
	   int i=preparedStatement.executeUpdate();
	   connection.close();
	   return i;  
	}
	public String login(String email) throws Exception {
		
		Connection connection=getConnection();
		
	PreparedStatement preparedStatement=connection.prepareStatement("SELECT PASSWORD FROM EMP WHERE EMAIL=?");
	preparedStatement.setString(1, email);
      
	ResultSet resultSet=preparedStatement.executeQuery();
	String pass=null;
	while (resultSet.next()) {
		
		pass=resultSet.getString("password");
	}
	connection.close();
	return pass;

	}
	public List<Emp> display() throws Exception {
		
		Connection connection=getConnection();
		
		PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM EMP");
		
		ResultSet resultSet=preparedStatement.executeQuery();
		
		List<Emp> emps=new ArrayList<Emp>();
		
		while (resultSet.next()) {
			
		   Emp e1=new Emp();
		   e1.setId(resultSet.getInt("id"));
		   e1.setName(resultSet.getString("name"));
		   e1.setAddress(resultSet.getString("address"));
		   e1.setEmail(resultSet.getString("email"));
		   e1.setPassword(resultSet.getString("password"));
		   e1.setPhone(resultSet.getLong("phone"));
		   
		   emps.add(e1);
		   
		}
		connection.close();
		return emps;
	
	}
	public int delete(int id) throws Exception {
		
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("DELETE FROM EMP WHERE ID=?");
		preparedStatement.setInt(1,id);
		
		 int i=preparedStatement.executeUpdate();
		 connection.close();
		 return i;
	}
	 public Emp find(int id) throws Exception {
		
		 Connection connection=getConnection();
		 
		 PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM EMP WHERE ID=?");
		 preparedStatement.setInt(1, id);
		 ResultSet resultSet=preparedStatement.executeQuery();
		 Emp e1=new Emp();
		 while (resultSet.next()) {
		 
			   e1.setId(resultSet.getInt("id"));
			   e1.setName(resultSet.getString("name"));
			   e1.setAddress(resultSet.getString("address"));
			   e1.setEmail(resultSet.getString("email"));
			   e1.setPassword(resultSet.getString("password"));
			   e1.setPhone(resultSet.getLong("phone"));
 
		}
		 connection.close();
		 return e1;
		
		 
		 
		
	}
	public int update(Emp emp) throws Exception {
		 
		 Connection connection=getConnection();
		   
		   PreparedStatement preparedStatement=connection.prepareStatement("UPDATE EMP SET NAME=?,PHONE=?,ADDRESS=?,EMAIL=?,PASSWORD=? WHERE ID=?");
		   preparedStatement.setInt(6,emp.getId());
		   preparedStatement.setString(1,emp.getName());
		   preparedStatement.setLong(2,emp.getPhone());
		   preparedStatement.setString(3,emp.getAddress());
		   preparedStatement.setString(4,emp.getEmail());
		   preparedStatement.setString(5,emp.getPassword());
		   
		   int i=preparedStatement.executeUpdate();
		   connection.close();
		   return i;  
	}
}


