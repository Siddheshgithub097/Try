package employee_management;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")

public class Login extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		Employee employee=new Employee();
		employee.setEmail(email);
		employee.setPassword(password);
		 EmployeeCRUD crud=new EmployeeCRUD();
		try {
			String rs=crud.login(email);
			if (employee.getPassword().equals(rs)) 
			{
				List<Employee>list=crud.display();
				req.setAttribute("login", employee);
				resp.sendRedirect("display.jsp");
				
			}
			else {
				resp.sendRedirect("login.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
