//Write a Java program to fetch data from web.xml to Servlet using ServletConfig.

package Pro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Servletconfig")
public class Servletconfig extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ServletConfig config = null;
    public Servletconfig() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
    	this.config = config;
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		out.println("<h1>Username is :" + username);
		out.println("<h1>Password is :" + password);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
