package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.HomeDao;
//import com.dao.HomeDao;
import com.dao.Showdao;
import com.model.UserModel;

@WebServlet("/ShowController")
public class ShowController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ShowController() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equals("edituser"))
		{
			int userid = Integer.parseInt(request.getParameter("userid"));
			UserModel model = new Showdao().detailofStudent(userid);
			request.setAttribute("hmodel", model);
			request.getRequestDispatcher("show.jsp").forward(request, response);
		}
		else if(action.equals("edituser"))
		{
			int userid = Integer.parseInt(request.getParameter("userid"));
			int x = new Showdao().deleteUser(userid);
			System.out.println(x);
			request.setAttribute("msg", "Record deleted");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserModel hmodel = new UserModel();
		hmodel.setUserid(Integer.parseInt(request.getParameter("userid")));
		hmodel.setFirstname(request.getParameter("firstname"));
		hmodel.setLastname(request.getParameter("lastname"));
		hmodel.setEmail(request.getParameter("email"));
		hmodel.setMobile(request.getParameter("mobile"));
		hmodel.setGender(request.getParameter("gender"));
		hmodel.setPassword(request.getParameter("password"));
		int x = new Showdao().updateUser(hmodel);
		System.out.println("Update successfully...");
		System.out.println(x);
		if(x>0)
		{
			response.sendRedirect("homecontroller?action=showuser&userid=" + hmodel.getUserid());		
		}		
	}

}
