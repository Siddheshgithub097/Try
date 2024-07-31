package sessiontracking;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/session")
public class HttpSession extends HttpServlet
{
     @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	 
    	   HttpSession hs =  (HttpSession) req.getSession();
    	   HttpSession hs1= (HttpSession) req.getSession();
    	                  hs.setAttribute("id",1);
    	                  hs.setAttribute("name","mahesh");
    	                  hs.setAttribute("phno",12345678l);
    	             
    	
    }
}
