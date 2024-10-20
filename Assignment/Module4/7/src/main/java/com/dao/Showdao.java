package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.UserModel;
import com.util.DBUtil;

public class Showdao {
	Connection cn = null;
	public UserModel detailofStudent(int userid)
	{
		UserModel model = null;
		cn = new DBUtil().getConnection();
		String qry = "select * from students where userid=?";
		try {
			PreparedStatement st = cn.prepareStatement(qry);
			st.setInt(1, userid);
			ResultSet rs = st.executeQuery();
			if(rs.next())
			{
				model = new UserModel();
				model.setUserid(rs.getInt(1));
				model.setFirstname(rs.getString(2));
				model.setLastname(rs.getString("lastname"));
				model.setEmail(rs.getString(4));
				model.setMobile(rs.getString(5));
				model.setGender(rs.getString(6));
				model.setPassword(rs.getString(7));
			}
			cn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return model;
	}
	
	public int updateUser(UserModel hmodel)
	{
		int x = 0;
		cn = new DBUtil().getConnection();
		String qry = "update student set firstname=?,lastname=?,email=?,mobile=?,gender=?,password=? where useid=?";
		try {
			PreparedStatement st = cn.prepareStatement(qry);
			st.setString(1, hmodel.getFirstname());
			st.setString(2, hmodel.getLastname());
			st.setString(3, hmodel.getEmail());
			st.setString(4, hmodel.getMobile());
			st.setString(5, hmodel.getGender());
			st.setString(5, hmodel.getPassword());
			x = st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
	}
	
	public int deleteUser(int userid) {
	    int x = 0;
	    cn = new DBUtil().getConnection();
	    String qry = "delete from user where userid=?";
	    try {
	        PreparedStatement st = cn.prepareStatement(qry);
	        st.setInt(1, userid);
	        x = st.executeUpdate();
	        cn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return x;
	}
}
