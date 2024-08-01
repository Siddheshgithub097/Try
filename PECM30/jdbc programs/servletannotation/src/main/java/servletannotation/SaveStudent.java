package servletannotation;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/studentform")
public class SaveStudent extends GenericServlet
{
      
	    @Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		   String id =req.getParameter("id");
		   String name =req.getParameter("nm");
		   String age =req.getParameter("age");
		   String mb =req.getParameter("mb");
		   String ypo =req.getParameter("ypo");
	}
}
