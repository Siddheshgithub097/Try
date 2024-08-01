package jdbc_product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MainController 
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
		Scanner scanner=new Scanner(System.in);
		System.out.println("how many product you want to add for the batch ?");
		int size=scanner.nextInt();
		List<Product>p=new ArrayList<>();
		for(int i=1;i<=size;i++)
		{
			Product product1=new Product();
			System.out.println("Enter the id");
			product1.setId(scanner.nextInt());
			System.out.println("Enter the name");
			product1.setName(scanner.next());
			System.out.println("Enter the price");
			product1.setPrice(scanner.nextDouble());
			System.out.println("Enter the brand");
			product1.setBrand(scanner.next());
			p.add(product1);
				
		}
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/productdb", "root","Ram@2809");
		PreparedStatement ps= conn.prepareStatement("insert into Product values(?,?,?,?)");
		for(Product product:p)
		{
			ps.setInt(1, product.getId());
			ps.setString(2,product.getName());
			ps.setDouble(3, product.getPrice());
			ps.setString(4, product.getBrand());
			ps.addBatch();
		}
		ps.executeBatch();
		conn.close();
		System.out.println("execute successfully");
		
		
		
		
	}
}
