package Com.module3;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class User implements ActionListener {

    JFrame frame;
    JLabel l1, l2, l3, l4, l5, msg;
    JTextField t1, t2, t3, t4;

    JRadioButton male, female;

    JButton b1, b2, b3, b4, b5;

    JTable table;
    DefaultTableModel model;


    public User() {
        frame = new JFrame("Module 3 EX-1");
        frame.setSize(1080, 1080);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("ID");
        l2 = new JLabel("Name");
        l3 = new JLabel("Gender");
        l4 = new JLabel("Address");
        l5 = new JLabel("Contact");
        msg = new JLabel(" ");

        t1 = new JTextField(12);
        t2 = new JTextField(50);
        t3 = new JTextField(50);
        t4 = new JTextField(50);

        male = new JRadioButton("male");
        female = new JRadioButton("female");

        ButtonGroup Genders = new ButtonGroup();
        Genders.add(male);
        Genders.add(female);

        b1 = new JButton("Register");
        b2 = new JButton("Update");
        b3 = new JButton("Delete");
        b4 = new JButton("Display");
        b5 = new JButton("Refresh");

        model = new DefaultTableModel();
        table = new JTable(model);
        model.addColumn("S.No");
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Gender");
        model.addColumn("Address");
        model.addColumn("Contact");

        JScrollPane scrollPane = new JScrollPane(table);

        l1.setBounds(30, 30, 60, 30);
        l2.setBounds(30, 70, 60, 30);
        l3.setBounds(30, 110, 60, 30);
        l4.setBounds(30, 150, 60, 30);
        l5.setBounds(30, 190, 60, 30);
        msg.setBounds(30, 350, 300, 30);

        t1.setBounds(100, 30, 150, 30);
        t2.setBounds(100, 70, 150, 30);
        male.setBounds(100, 110, 70, 30);
        female.setBounds(180, 110, 80, 30);
        t3.setBounds(100, 150, 150, 30);
        t4.setBounds(100, 190, 150, 30);

        b1.setBounds(30, 230, 100, 30);
        b2.setBounds(140, 230, 100, 30);
        b3.setBounds(30, 270, 100, 30);
        b4.setBounds(140, 270, 100, 30);
        b5.setBounds(30, 310, 210, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        scrollPane.setBounds(300, 30, 400, 300);


        frame.add(l1);
        frame.add(t1);

        frame.add(l2);
        frame.add(t2);

        frame.add(l3);
        frame.add(male);
        frame.add(female);

        frame.add(l4);
        frame.add(t3);

        frame.add(l5);
        frame.add(t4);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(scrollPane);

        frame.add(msg);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/module3", "root", "@kri$h@A");
                System.out.println("Connection Establish...");
                Statement st = cn.createStatement();

                String gender = "";
                if (male.isSelected()) {
                    gender = "male";
                } else if (female.isSelected()) {
                    gender = "female";
                } else {
                    msg.setText("Please select a gender");
                    return;
                }

                String query = "INSERT INTO users (id, name, gender, address, contact) VALUES(" + t1.getText() + ", '" + t2.getText() + "', '" + gender + "', '" + t3.getText() + "', '" + t4.getText() + "')";

                int x = st.executeUpdate(query);
                if (x > 0) {
                    msg.setText("Register Successfully");
                } else {
                    msg.setText("Register not successfully Please try again");
                }
                cn.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if (e.getSource() == b2) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/module3", "root", "@kri$h@A");
                System.out.println("Connection Establish...");
                Statement st = cn.createStatement();
                String gender = "";
                if (male.isSelected()) {
                    gender = "male";
                } else if (female.isSelected()) {
                    gender = "female";
                } else {
                    msg.setText("Please select a gender");
                    return;
                }
                String query = "UPDATE users SET name = '" + t2.getText() + "', gender = '" + gender + "', address = '" + t3.getText() + "', contact = '" + t4.getText() + "' WHERE id = " + t1.getText();

                int x = st.executeUpdate(query);
                if (x > 0) {
                    msg.setText("Record Update Successfully...");
                } else {
                    msg.setText("Record not Update Successfully...");
                }
                cn.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if (e.getSource() == b3) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/module3", "root", "@kri$h@A");
                System.out.println("Connection Establish...");
                Statement st = cn.createStatement();
                String query = "DELETE FROM users WHERE id = " + t1.getText();
                int x = st.executeUpdate(query);
                if (x > 0) {
                    msg.setText("Record Delete Successfully...");
                } else {
                    msg.setText("Record not Delete Successfully...");
                }
                cn.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if (e.getSource() == b4) {
            try {
                String a = t1.getText();
                if (a.isEmpty()) {
                    System.out.println("Enter correct id");
                    msg.setText("enter correct id");
                    return;
                }
                Class.forName("com.mysql.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/module3", "root", "@kri$h@A");
                System.out.println("Connection Establish...");
                Statement st = cn.createStatement();
                String query = "SELECT * FROM users WHERE id = " + t1.getText() + " ";
                int SerialNo = 1;
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {

                    model.addRow(new Object[]{
                            SerialNo++,
                            rs.getInt("id"),
                            rs.getString("Name"),
                            rs.getString("Gender"),
                            rs.getString("Address"),
                            rs.getString("Contact"),
                    });

//
//                    msg.setText("<html>Id is: " + rs.getInt(1) + "<br>" +
//                            "Name is: " + rs.getString("Name") + "<br>" +
//                            "Gender is: " + rs.getString("Gender") + "<br>" +
//                            "Address is: " + rs.getString("Address") + "<br>" +
//                            "Contact is: " + rs.getString("Contact") + "</html>");

                }

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if (e.getSource() == b5) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            male.setSelected(false);
            female.setSelected(false);

            model.setRowCount(0);

            msg.setText(" ");

        }
    }
}

public class Ex1 {
    public static void main(String[] args) {
        new User();
    }
}