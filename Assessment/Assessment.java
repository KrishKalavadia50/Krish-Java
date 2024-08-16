package Com.Assessment1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class jdbc implements ActionListener
{
    JFrame frame;
    JLabel l1,l2,l3,l4,l5,msg;
    JTextField t1,t2,t3,t4,t5;
    JButton b1,b2,b3,b4;

    public jdbc()
    {
        frame = new JFrame();
        frame.setLayout(new GridLayout(8,2));
        frame.setSize(500,1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Enter sid : ");
        l2 = new JLabel("Enter Fisrt Name : ");
        l3 = new JLabel("Enter Last Name : ");
        l4 = new JLabel("Enter Email : ");
        l5 = new JLabel("Enter Mobile : ");
        msg = new JLabel(" ");

        t1 = new JTextField(15);
        t2 = new JTextField(30);
        t3 = new JTextField(30);
        t4 = new JTextField(30);
        t5 = new JTextField(10);

        b1 = new JButton("Insert");
        b2 = new JButton("Update");
        b3 = new JButton("Delete");
        b4 = new JButton("Display");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        frame.add(l1);
        frame.add(t1);

        frame.add(l2);
        frame.add(t2);

        frame.add(l3);
        frame.add(t3);

        frame.add(l4);
        frame.add(t4);

        frame.add(l5);
        frame.add(t5);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);

        frame.add(msg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1)
        {
            try {
                int x;
                Class.forName("com.mysql.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Assessment","root","@kri$h@A");
                System.out.println("Connection establish...");
                Statement stmt = cn.createStatement();
                String query = "insert into Student values("+t1.getText()+",'"+t2.getText()+"','"+ t3.getText()+ "','"+t4.getText()+"','"+t5.getText()+"')";
                x = stmt.executeUpdate(query);
                if(x > 0)
                {
                    msg.setText("Record Inserted Successfully...");
                }
                else
                {
                    msg.setText("Record not inserted Successfully...");
                }
                cn.close();
            }
            catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        else if(e.getSource() == b2)
        {
            try {
                int x;
                Class.forName("com.mysql.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Assessment","root","@kri$h@A");
                System.out.println("Connection done");
                Statement stmt = cn.createStatement();
                String query = "update Student set First name='"+ t2.getText()+"', Last Name='"+t3.getText()+"' , Email='"+ t4.getText()+"' , Mobile='"+t5.getText()+"' where sid="+t1.getText()+"";
                x = stmt.executeUpdate(query);
                if(x > 0)
                {
                    msg.setText("Record Updated Successfully...");
                }
                else
                {
                    msg.setText("Record not updated Successfully...");
                }
                cn.close();
            }
            catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        else if(e.getSource() == b3)
        {
            try {
                int x;
                Class.forName("com.mysql.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Assessment","root","@kri$h@A");
                System.out.println("Connection done");
                Statement stmt = cn.createStatement();
                String query = "delete from Student where sid="+t1.getText()+"";
                x = stmt.executeUpdate(query);
                if(x > 0)
                {
                    msg.setText("Record Deleted Successfully...");
                }
                else
                {
                    msg.setText("Record not Deleted...");
                }
                cn.close();
            }
            catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        else if(e.getSource() == b4)
        {
            try {
                String a = t1.getText();
                if(a.isEmpty())
                {
                    System.out.println("please enter the Id");
                    msg.setText("please enter the Id");
                    return;
                }
                Class.forName("com.mysql.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Assessment","root","@kri$h@A");
                System.out.println("Connection done");
                Statement stmt = cn.createStatement();
                String query =  "select * from Student where Id = "+t1.getText()+"";
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next())
                {
                    msg.setText("<html>Sid is: " + rs.getInt(1) + "<br>" +
                            "First Name is: " + rs.getString(2) + "<br>" +
                            "Last Name is: " + rs.getString(3) + "<br>" +
                            "Email is: " + rs.getString(4) + "<br>" + "Email is: " + rs.getString(5) + "</html>");
                }
                cn.close();
            }
            catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

}
public class Assessment {
    public static void main(String[] args) {
        new jdbc();
    }
}
