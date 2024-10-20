package com.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.model.Message;
import com.util.DBUtil;

public class MessageDao {
	public void sendMessage(Message message) throws SQLException {
		Connection con = new DBUtil().getConnection();
        String query = "INSERT INTO messages(`from`, `to`, msg) VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, message.getFrom());
        ps.setInt(2, message.getTo());
        ps.setString(3, message.getMsg());
        ps.executeUpdate();
        ps.close();
        con.close();
    }
	
	public List<Message> getMessagesForUser(int userId) throws SQLException {
		Connection con = new DBUtil().getConnection();
        String query = "SELECT * FROM messages WHERE `to` = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, userId);
        ResultSet rs = ps.executeQuery();
        List<Message> messages = new ArrayList<>();
        while (rs.next()) {
            Message message = new Message();
            message.setMid(rs.getInt("mid"));
            message.setFrom(rs.getInt("from"));
            message.setTo(rs.getInt("to"));
            message.setMsg(rs.getString("msg"));
            messages.add(message);
        }
        rs.close();
        ps.close();
        con.close();
        return messages;
	}
}
