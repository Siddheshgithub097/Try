package project;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/update")
public class Update extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
		
		int id=Integer.parseInt(req.getParameter("id"));
		EmpCRUD crud=new EmpCRUD();
		
		try {
			Emp emp=crud.find(id);
			req.setAttribute("emp", emp);
			RequestDispatcher dispatcher=req.getRequestDispatcher("edit.jsp");
			dispatcher.forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

