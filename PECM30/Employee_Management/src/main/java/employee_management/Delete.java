package employee_management;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Delete extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		EmployeeCRUD crud=new EmployeeCRUD();
		try {
			int i=crud.delete(id);
			if (i!=0) {
				List<Employee>employees=crud.display();
				req.setAttribute("delete", employees);
				resp.sendRedirect("login.jsp");
			}
			else {
				resp.sendRedirect("home.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
