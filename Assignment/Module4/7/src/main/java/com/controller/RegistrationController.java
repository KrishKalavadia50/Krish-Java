package com.controller;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RegistrationDao;
import com.model.UserModel;

@WebServlet("/RegistrionController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String NAME_PATTERN = "^[a-zA-Z]+$";	
	private static final String EMAIL_PATTERN = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    private static final String MOBILE_PATTERN = "^\\d{10}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%&_])[A-Za-z\\d@#$%&_]{8,}$";
    
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 UserModel model = new UserModel();
//	        model.setUserid(Integer.parseInt(request.getParameter("userid")));
	        model.setFirstname(request.getParameter("firstname"));
	        model.setLastname(request.getParameter("lastname"));
	        model.setEmail(request.getParameter("email"));
	        model.setMobile(request.getParameter("mobile"));
	        model.setGender(request.getParameter("gender"));
	        model.setPassword(request.getParameter("password"));
	        
	        String firstname = model.getFirstname();
	        String lastname = model.getLastname();
	        String email = model.getEmail();
	        String password = model.getPassword();
	        String mobile = model.getMobile();
//	        String gender = model.getGender();
	        
	        StringBuilder error = new StringBuilder();
	        
	        if (!Pattern.matches(NAME_PATTERN, firstname)) {
	            error.append("First Name must contain only alphabets.<br>");
	        }
	        if (!Pattern.matches(NAME_PATTERN, lastname)) {
	            error.append("Last Name must contain only alphabets.<br>");
	        }
	        if (!Pattern.matches(MOBILE_PATTERN, mobile)) {
	            error.append("Mobile number must be exactly 10 digits.<br>");
	        }
	        if (!Pattern.matches(EMAIL_PATTERN, email)) {
	            error.append("Invalid Email format.<br>");
	        }
	        if (!Pattern.matches(PASSWORD_PATTERN, password)) {
	            error.append("Password must contain at least 1 uppercase letter, 1 lowercase letter, 1 digit, and 1 special character (@#$%&_).<br>");
	        }
	        
	        if (error.length() > 0) {
	            response.setContentType("text/html");
	            response.getWriter().println("<html><head>");
	            response.getWriter().println("<link rel='stylesheet' type='text/css' href='styles.css'>");
	            response.getWriter().println("</head><body>");
	            response.getWriter().println("<div class='error-container'>");
	            response.getWriter().println("<h2>Validation Errors:</h2>");
	            response.getWriter().println("<div class='error-messages'>" + error.toString() + "</div>");
	            response.getWriter().println("<br><br><a href='index.jsp' class='back-link'>Go Back</a>");
	            response.getWriter().println("</div>");
	            response.getWriter().println("</body></html>");
	        }

	        int generatedId = new RegistrationDao().userRegistration(model);
	        System.out.println("Record inserted with ID: " + generatedId);

	        if (generatedId > 0) {
	            request.setAttribute("id", generatedId); // Pass the ID to the show.jsp page
	            request.setAttribute("firstname", model.getFirstname());
	            request.setAttribute("lastname", model.getLastname());
	            request.setAttribute("email", model.getEmail());
	            request.setAttribute("mobile", model.getMobile());
	            request.setAttribute("gender", model.getGender());
	            request.getRequestDispatcher("show.jsp").forward(request, response);
	        } else {
	            request.getRequestDispatcher("index.jsp").forward(request, response);
	        }
	}

}
