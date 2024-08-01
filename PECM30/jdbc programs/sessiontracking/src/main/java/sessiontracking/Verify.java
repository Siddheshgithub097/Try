package sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Verify extends HttpServlet
{
          @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        	
        	     String email =req.getParameter("em");
        	      String password =req.getParameter("ps");
        	      
        	      String email1="dinga@gmail.com";
        	      String pass1="dinga123";
        	      
        	      if(email1==email && password==pass1)
        	      {
        	    	   RequestDispatcher red = req.getRequestDispatcher("welcome.html");
        	      }
        	      else
        	      {
        	    	          PrintWriter pout = resp.getWriter();
        	    	          pout.println("<h1>Inavlid username or password</h2>");
        	      }
        }
}
