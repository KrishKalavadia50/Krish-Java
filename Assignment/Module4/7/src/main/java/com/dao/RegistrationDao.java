package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.SQLException;
import java.sql.ResultSet;

import com.model.UserModel;
import com.util.DBUtil;

public class RegistrationDao {
	Connection cn = null;
	public int userRegistration(UserModel rmodel)
	{
		int generatedId = 0;
        cn = new DBUtil().getConnection();
        String qry = "INSERT INTO students(firstname, lastname, email, mobile, gender, password) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = cn.prepareStatement(qry);
            stmt.setString(1, rmodel.getFirstname());
            stmt.setString(2, rmodel.getLastname());
            stmt.setString(3, rmodel.getEmail());
            stmt.setString(4, rmodel.getMobile());
            stmt.setString(5, rmodel.getGender());
            stmt.setString(6, rmodel.getPassword());

            int affectedRows = stmt.executeUpdate();

            if (affectedRows > 0) {
                // Retrieve the generated keys (i.e., the auto-incremented id)
                ResultSet generatedKeys = stmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    generatedId = generatedKeys.getInt(1); // Get the first generated column (ID)
                }
            }
            cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return generatedId;
	}
}
