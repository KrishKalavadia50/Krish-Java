package Pro;

import java.io.IOException;
//import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Student")
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//			PrintWriter out = response.getWriter();
			String fname = request.getParameter("fname");
	        String lname = request.getParameter("lname");
	        String email = request.getParameter("email");
	        String mobile = request.getParameter("mobile");
	        String gender = request.getParameter("gender");
	        String password = request.getParameter("password");
      
	        System.out.println("Student Information:");
	        System.out.println("First Name: " + fname);
//	        out.println(fname);
	        System.out.println("Last Name: " + lname);
//	        out.println(lname);
	        System.out.println("Email: " + email);
//	        out.println(email);
	        System.out.println("Mobile: " + mobile);
//	        out.println(mobile);
	        System.out.println("Gender: " + gender);
//	        out.println(gender);
	        System.out.println("Password: " + password);
//	        out.println(password);
	        
	        request.setAttribute("firstname", fname);
			request.setAttribute("lastname", lname);
			request.setAttribute("email", email);
			request.setAttribute("mobile", mobile);
			request.setAttribute("gender", gender);
			request.setAttribute("password", password);
			
			request.getRequestDispatcher("studentjsp.jsp").forward(request,response);
	}

}
