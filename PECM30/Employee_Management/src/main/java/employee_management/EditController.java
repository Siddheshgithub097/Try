package employee_management;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditController extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
			int i=crud.update(emp);
			if (i!=0)
			{
			     List<Employee>employees=crud.display();
			     req.setAttribute("update", employees);
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
