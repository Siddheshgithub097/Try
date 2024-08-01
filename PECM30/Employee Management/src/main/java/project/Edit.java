package project;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/edit")
public class Edit extends HttpServlet
{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
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
			int i=crud.update(emp);
			if (i!=0) {		
				List<Emp>e1=crud.display();
				req.setAttribute("login",e1);
				RequestDispatcher dispatcher=req.getRequestDispatcher("display.jsp");
				dispatcher.forward(req, resp);
			}
			else
			{
				req.setAttribute("login","INVALID CREDANTIALS");
				RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
				dispatcher.forward(req, resp);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}



