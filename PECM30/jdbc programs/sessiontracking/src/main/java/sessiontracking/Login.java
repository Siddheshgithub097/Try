package sessiontracking;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mainmainu")
public class Login extends HttpServlet
{
   @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        
	       Cookie[] cookies =req.getCookies();
	       
	       if(cookies!=null)
	       {
	    	   RequestDispatcher red =req.getRequestDispatcher("welcome.html");
	    	   red.forward(req, resp);
	       }
	       else
	       {
	    	    RequestDispatcher red =req.getRequestDispatcher("mainmainu.html") ;
	    	    red.forward(req, resp);
	       }
	
}
	
}
