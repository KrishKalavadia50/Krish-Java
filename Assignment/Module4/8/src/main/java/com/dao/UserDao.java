package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.User;
import com.util.DBUtil;

public class UserDao {
	 public void addUser(User user) throws SQLException
	 {
		 Connection con = new DBUtil().getConnection();
		 String query = "INSERT INTO users(fname, lname, email, mobile) VALUES (?, ?, ?, ?)";
	     PreparedStatement ps = con.prepareStatement(query);
	     ps.setString(1, user.getFname());
	     ps.setString(2, user.getLname());
	     ps.setString(3, user.getEmail());
	     ps.setString(4, user.getMobile());
	     ps.executeUpdate();
	     ps.close();
	     con.close();
	 }
	 
	 public List<User> getAllUsers() throws SQLException {
		 	Connection con = new DBUtil().getConnection();
	        String query = "SELECT * FROM users";
	        PreparedStatement ps = con.prepareStatement(query);
	        ResultSet rs = ps.executeQuery();
	        List<User> users = new ArrayList<>();
	        while (rs.next()) {
	            User user = new User();
	            user.setUid(rs.getInt("uid"));
	            user.setFname(rs.getString("fname"));
	            user.setLname(rs.getString("lname"));
	            user.setEmail(rs.getString("email"));
	            user.setMobile(rs.getString("mobile"));
	            users.add(user);
	        }
	        rs.close();
	        ps.close();
	        con.close();
	        return users;
	    }
}
