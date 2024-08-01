package jdbc_product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BatchExecution 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
		Product product1=new Product();
		product1.setId(1);
		product1.setName("tv");
		product1.setPrice(15000.00);
		product1.setBrand("samsung");
		
		Product product2=new Product();
		product2.setId(2);
		product2.setName("mobile");
		product2.setPrice(12000.00);
		product2.setBrand("redmi");
		
		Product product3=new Product();
		product3.setId(3);
		product3.setName("charger");
		product3.setPrice(150.00);
		product3.setBrand("samsung");
		
		List<Product>product=new ArrayList<>();
		product.add(product1);
		product.add(product2);
		product.add(product3);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb", "root","Ram@2809");
		PreparedStatement ps=conn.prepareStatement("insert into product values(?,?,?,?)");
		for(Product p:product)
		{
			ps.setInt(1, p.getId());
			ps.setString(2,p.getName());
			ps.setDouble(3, p.getPrice());
			ps.setString(4, p.getBrand());
			ps.addBatch();
		}
		ps.executeBatch();
		conn.close();
		System.out.println("execute successfully");
		
	}
   
}
