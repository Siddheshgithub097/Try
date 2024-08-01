package employee_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeCRUD 
{
	public Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management","root","Siddhesh@123");
		return connection;
	}
	
	public int signUp(Employee emp) throws ClassNotFoundException, SQLException
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("insert into employee values(?,?,?,?,?)");
		preparedStatement.setInt(1, emp.getId());
		preparedStatement.setString(2, emp.getName());
		preparedStatement.setInt(3, emp.getAge());
		preparedStatement.setString(4,emp.getEmail());
		preparedStatement.setString(5,emp.getPassword());
		int count=preparedStatement.executeUpdate();
		preparedStatement.close();
		return count;
	
	}
	
	public String login(String email) throws ClassNotFoundException, SQLException
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("select password from employee where email=?");
		preparedStatement.setString(1, email);
		ResultSet rs=preparedStatement.executeQuery();
		String password=null;
		while (rs.next()) 
		{
			password=rs.getString("password");
			
		}
		preparedStatement.close();
		return password;
	}
	public List<Employee> display() throws ClassNotFoundException, SQLException
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("select * from employee");
		ResultSet rs=preparedStatement.executeQuery();
		List<Employee>list=new ArrayList();
		while (rs.next()) 
		{
			Employee emp=new Employee();
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("name"));
			emp.setAge(rs.getInt("age"));
			emp.setEmail(rs.getString("email"));
			emp.setPassword(rs.getString("password"));
			list.add(emp);
			
		}
		connection.close();
		return list;
	}
	public int update(Employee employee) throws ClassNotFoundException, SQLException
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("update employee set name=?,age=?,email=?,password=? where id=?");
		preparedStatement.setString(1, employee.getName());
		preparedStatement.setInt(2, employee.getAge());
		preparedStatement.setString(3, employee.getEmail());
		preparedStatement.setString(4, employee.getPassword());
		preparedStatement.setInt(5, employee.getId());
		int i=preparedStatement.executeUpdate();
		connection.close();
		return i;
		
	}
	public Employee find(int id) throws ClassNotFoundException, SQLException
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("select * from employee where id=?");
		preparedStatement.setInt(1, id);
		ResultSet rs=preparedStatement.executeQuery();
		Employee emp=new Employee();
		while (rs.next()) 
		{
			emp.setId(rs.getInt("id"));
			emp.setName(rs.getString("name"));
			emp.setAge(rs.getInt("age"));
			emp.setEmail(rs.getString("email"));
			emp.setPassword(rs.getString("password"));
		}
		connection.close();
		return emp;
	}
	public int delete(int id) throws ClassNotFoundException, SQLException
	{
		Connection connection=getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("delete from employee where id=?");
		preparedStatement.setInt(1, id);
		int i=preparedStatement.executeUpdate();
		connection.close();
		return i;
	}

}
