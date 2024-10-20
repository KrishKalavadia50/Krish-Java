/*//Write a Java program to validate jsp form server side.
//First Name: Only Alphabets Last Name: Only Alphabets Mobile: Only 10 Numbers
//Email: Standard Email Id
//Password: Minimum One 1 Upper, Minimum 1 Lower, Minimum 1 Digit, Minimum
//1 Special Character from@, #, $, %, _, & I2. Write CRUD operation using jsp only.
*/
package Pro;

import java.io.IOException;
import java.util.regex.Pattern;

//import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/employee")
public class employee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String NAME_PATTERN = "^[a-zA-Z]+$";
    private static final String MOBILE_PATTERN = "^\\d{10}$";
    private static final String EMAIL_PATTERN = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    private static final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%&_])[A-Za-z\\d@#$%&_]{8,}$";
    
    public employee() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 	String fname = request.getParameter("fname");
	        String lname = request.getParameter("lname");
	        String mobile = request.getParameter("mobile");
	        String email = request.getParameter("email");
	        String password = request.getParameter("password");
	        
	        StringBuilder errors = new StringBuilder();

	        if (!Pattern.matches(NAME_PATTERN, fname)) {
	            errors.append("First Name must contain only alphabets.<br>");
	        }
	        if (!Pattern.matches(NAME_PATTERN, lname)) {
	            errors.append("Last Name must contain only alphabets.<br>");
	        }
	        if (!Pattern.matches(MOBILE_PATTERN, mobile)) {
	            errors.append("Mobile number must be exactly 10 digits.<br>");
	        }
	        if (!Pattern.matches(EMAIL_PATTERN, email)) {
	            errors.append("Invalid Email format.<br>");
	        }
	        if (!Pattern.matches(PASSWORD_PATTERN, password)) {
	            errors.append("Password must contain at least 1 uppercase letter, 1 lowercase letter, 1 digit, and 1 special character (@#$%&_).<br>");
	        }
	        
	        if (errors.length() > 0) {
	            response.setContentType("text/html");
	            response.getWriter().println("<html><body>");
	            response.getWriter().println("<h2>Validation Errors:</h2>");
	            response.getWriter().println(errors.toString());
	            response.getWriter().println("<br><br><a href='form.jsp'>Go Back</a>");
	            response.getWriter().println("</body></html>");
	        } 
	        else {
	            // If no validation errors, display success message
	            response.setContentType("text/html");
	            response.getWriter().println("<html><body>");
	            response.getWriter().println("<h2>Form Submitted Successfully!</h2>");
	            response.getWriter().println("<p>First Name: " + fname + "</p>");
	            response.getWriter().println("<p>Last Name: " + lname + "</p>");
	            response.getWriter().println("<p>Mobile: " + mobile + "</p>");
	            response.getWriter().println("<p>Email: " + email + "</p>");
	            response.getWriter().println("<p>Password: [Hidden for Security]</p>");
	            response.getWriter().println("</body></html>");
	        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
