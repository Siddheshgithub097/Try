package sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/fectch")
public class GetCookies extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
                       Cookie[] cookies =req.getCookies();
                       if(cookies!=null)
						{
						   for (int i = 0;i < cookies.length; i++) 
                       {
                    	       Cookie c = cookies[i];
                    	       System.out.println(c.getName()+" "+c.getValue());
						
				          	}
						}
                       else
                       {
                    	PrintWriter pout =resp.getWriter();
                    	pout.println("<h1>Cokkies are not avialable</h1>");
                       }
                   }

    	
    } 

