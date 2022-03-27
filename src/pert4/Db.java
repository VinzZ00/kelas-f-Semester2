package pert4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {

	Connection con;
	Statement st;
	PreparedStatement ps;
	ResultSet rs;
	
	public Db() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kelasf", "root", "");
			st = con.createStatement();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertuser() {
		// TODO Auto-generated method stub
		try {
			ps = con.prepareStatement("insert into user values (?,?,?)");
			ps.setString(1, "Elvin");
			ps.setString(2, "Telolet");
			ps.setString(3, "002");
			
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResultSet getdata() {
		try {
			ps = con.prepareStatement("Select * from user");
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	public void updatename(String ID, String newname) {
		try {
			ps = con.prepareStatement("UPDATE `user` SET `username` = ? WHERE `user`.`USERID` = ? ");
			ps.setString(1, newname);
			ps.setString(2, ID);
			ps.execute();
			System.out.println("Selamat namanya udh keganti");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Kaga keganti");
		}
	}
	
	public void deletedata(String ID) {
		try {
			ps = con.prepareStatement("DELETE FROM `user` WHERE `user`.`USERID` = ? ");
			ps.setString(1, ID);
			ps.execute();
			System.out.println("Sudah terhapus");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ResultSet getaddressname() {
		try {
			rs = st.executeQuery("Select * from address");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
}
