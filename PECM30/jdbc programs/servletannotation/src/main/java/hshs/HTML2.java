package hshs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/html2")
public class HTML2  extends HttpServlet

{
      
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		        HttpSession hs1 = req.getSession(); 
		        
		        System.out.println(hs1.getAttribute("name"));
		      
		        System.out.println(hs1.getAttribute("age"));
		        System.out.println(hs1.getAttribute("email"));
		        
		
	}
}
