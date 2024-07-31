package servletannotation;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/akshay")
public class ServeltFile2 extends GenericServlet{
     @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	  System.out.println("This is file2 servlet2 connection ");
    }
}
