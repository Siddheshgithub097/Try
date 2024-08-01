package hshs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("")
public class HTML1  extends HttpServlet
{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	              
	               String name = req.getParameter("nm");
	                String age= req.getParameter("ag");
	                 String email = req.getParameter("em");
	                 
	                      HttpSession hs=req.getSession();
	                      
	                      hs.setAttribute("name", name);
	                      hs.setAttribute("age", age);
	                      hs.setAttribute("email", email);
	                      
	                         RequestDispatcher rd = req.getRequestDispatcher("secondfile.html");
	                           rd.forward(req, resp);
	   
          }
}
