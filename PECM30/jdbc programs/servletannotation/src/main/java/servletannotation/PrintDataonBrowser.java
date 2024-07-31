package servletannotation;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ResponseCache;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/printdata")
public class PrintDataonBrowser  extends GenericServlet{
               @Override
            public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
          
            	   
            	
           PrintWriter pw=res.getWriter() ;
           pw.println("<div style=margin-left:50%><table border=2px cellspacing:5px style=background-color:red ><tr><td>s1</td><td>s2</td><td>s3</td></tr><tr><td>s4</td><td>s5</td><td>s6</td></tr></table></div>");
            	
            }
}
