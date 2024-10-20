package com.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MessageDao;
import com.dao.UserDao;
import com.model.Message;
import com.model.User;
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserDao userDAO;
    private MessageDao messageDAO;

    public void init() {
        userDAO = new UserDao();
        messageDAO = new MessageDao();
    }
    
    public UserController() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
        if (action.equals("register")) {
            registerUser(request, response);
        } else if (action.equals("sendMessage")) {
            sendMessage(request, response);
        }
	}

	private void registerUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        
        User user = new User();
        user.setFname(fname);
        user.setLname(lname);
        user.setEmail(email);
        user.setMobile(mobile);
        
        try {
            userDAO.addUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        response.sendRedirect("registerSuccess.jsp");
    }
	private void sendMessage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int from = Integer.parseInt(request.getParameter("from"));
        int to = Integer.parseInt(request.getParameter("to"));
        String msg = request.getParameter("msg");

        Message message = new Message();
        message.setFrom(from);
        message.setTo(to);
        message.setMsg(msg);

        try {
            messageDAO.sendMessage(message);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("sendMessageSuccess.jsp");
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
