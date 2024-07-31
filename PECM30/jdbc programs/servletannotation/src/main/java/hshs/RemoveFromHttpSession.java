package hshs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/html1")
public class RemoveFromHttpSession extends HttpServlet {

	public static void main(String[] args) {
		   
	}
	   @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	                 HttpSession hs = req.getSession();
	                 hs.setAttribute("name", "ajay");
	                 hs.setAttribute("gender", "male");
	                 hs.setAttribute("age", 23);
	                 hs.setAttribute("adress", "pune");
	                 
	                 System.out.println(hs.getAttribute("age"));//10
	                 
	                 hs.removeAttribute("age");
	                 System.out.println(hs.getAttribute("age"));//null
	                 
	                 hs.invalidate();
	                 System.out.println(hs.getAttribute("name"));
	                 
	}
}
