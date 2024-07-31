package project;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/delete")
public class Delete extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)  {
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		EmpCRUD crud=new EmpCRUD();
		try {
			int i=crud.delete(id);
			if (i!=0) {
//				List<Emp>list=crud.display();
//				req.setAttribute("delete",list);
				 RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
				 dispatcher.forward(req, resp);
				
			} else {
				
				RequestDispatcher  dispatcher=req.getRequestDispatcher("home.jsp");
				dispatcher.include(req, resp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
