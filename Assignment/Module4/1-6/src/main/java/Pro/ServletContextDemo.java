//Write a Java program to fetch data from web.xml to Servlet using ServletContext.

package Pro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/ServletContextDemo")
public class ServletContextDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ServletContext context = null;
	
    public ServletContextDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init(ServletConfig config)
    {
    	this.context = config.getServletContext();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String firstname = context.getInitParameter("Firstname");
		String lastname = context.getInitParameter("Lastname");
		out.println("<h1>Username is :" + firstname);
		out.println("<h1>Password is :" + lastname);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
