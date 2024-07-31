package servletannotation;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ajay")
public class ServletFile3 extends HttpServlet 
{
	
     public static final String INSERT_QUERY="Insert into student(id,name,age) values(?,?,?)";
	 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	
	
	
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		String id=req.getParameter("em");
		String name=req.getParameter("nm");
		String age=req.getParameter("ag"); 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.getStackTrace();
		}

		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pejm17","root","Ajay@263115"); 
			PreparedStatement ps =con.prepareStatement(INSERT_QUERY);
			ps.setString(1,id);
			ps.setString(2,name);
			ps.setString(3,age);
			int count=ps.executeUpdate();
			if(count==0)
			{
				System.out.println("data not inserted ");
			}
			else
			{
				System.out.println("data inserted successfully");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
	
	
	
	
}  
	
   
}
