package servletannotation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servlet1")
public class Servelet1 extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	             HttpSession hs= req.getSession();
    	             System.out.println(hs);
    	            System.out.println( hs.getAttribute("id"));  
    	            System.out.println(hs.getAttribute("name"));
    	               
    	            System.out.println("servlet 1 is invoked");
    }
}
