package sessiontracking;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/session")
public class HtSession  extends HttpServlet{
     
	  @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		              javax.servlet.http.HttpSession hs = req.getSession();
//		              javax.servlet.http.HttpSession hs1= req.getSession();
//		                     
//		              hs.setAttribute("id",1);
//		               hs.setAttribute("name", "ajay");
//		               
//		             Integer i =(Integer) hs1.getAttribute("id");
//		              String s=(String) hs1.getAttribute("name");
//		              System.out.println(i);
//		              System.out.println(s);
		  
		            javax.servlet.http.HttpSession hs1=req.getSession();
		            System.out.println(hs1);
		            hs1.setAttribute("id", 1);
		            hs1.setAttribute("name","dingi");
		          RequestDispatcher rd = req.getRequestDispatcher("/servlet1");
		          rd.forward(req, resp);
		          
		          
		              
	}
}
