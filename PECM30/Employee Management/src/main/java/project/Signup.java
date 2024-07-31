package project;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/signup")
public class Signup extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		long phone=Long.parseLong(req.getParameter("phone"));
		String address=req.getParameter("address");
		String password=req.getParameter("password");
		String email=req.getParameter("email");
		
		Emp emp=new Emp();
		emp.setId(id);
		emp.setName(name);
		emp.setPhone(phone);
		emp.setAddress(address);
		emp.setEmail(email);
		emp.setPassword(password);
		
		EmpCRUD crud=new EmpCRUD();
		try {
			int op=crud.signup(emp);
			if (op!=0) {
				req.setAttribute("message","Signup successfull please login  ");
				RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
				dispatcher.forward(req, resp);
			}
			else
			{
				RequestDispatcher dispatcher=req.getRequestDispatcher("signup.jsp");
				dispatcher.forward(req, resp);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


