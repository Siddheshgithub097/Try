package employee_management;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/signup")
public class SignUp extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		String password=req.getParameter("password");
		String email=req.getParameter("email");
		
		Employee emp=new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setAge(age);
		emp.setEmail(email);
		emp.setPassword(password);
		
		EmployeeCRUD crud=new EmployeeCRUD();
		try {
			int res=crud.signUp(emp);
			if(res!=0)
			{
				resp.sendRedirect("https://www.google.com");
			}
			else {
				resp.sendRedirect("Signup.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
