package servletdemo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet2 extends GenericServlet 
{
       @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    	System.out.println("Hii good moring servlet is invoked");
    	
    }
	
}
