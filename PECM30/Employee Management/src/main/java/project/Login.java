package project;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/log")
public class Login extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp){
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		
		EmpCRUD crud=new EmpCRUD();
		
		try {
			
			//String pass=crud.login(email);
			if (password.equals(crud.login(email))) {
				List<Emp>emps=crud.display();
				req.setAttribute("login",emps);
				RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
				dispatcher.forward(req, resp);
			}
			else {
				req.setAttribute("login","invalid credentials");
				RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
				dispatcher.include(req, resp);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
