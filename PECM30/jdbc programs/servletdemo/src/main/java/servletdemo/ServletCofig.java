package servletdemo;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCofig extends HttpServlet{
            @Override
            protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            	             
            	  ServletContext servletContext = getServletContext();
            	String name  =servletContext.getInitParameter("name");
            	                          
            	System.out.println(name);
            	System.out.println(servletContext.getServerInfo());
            	System.out.println(servletContext.getMajorVersion());
            	
            	    ServletConfig servletConfig = getServletConfig();
            	     System.out.println(servletConfig.getServletName());//logical name 
            	     System.out.println(servletConfig.getInitParameter("name1"));
            }
}
