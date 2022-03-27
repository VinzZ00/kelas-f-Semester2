package pert4;

import java.awt.GridLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Main extends JFrame {
	JList<String> list;
	ResultSet rs;
	Db dbcon = new Db();
	Vector<String> listcontent = new Vector<String>();
	
	public Main() {
		// TODO Auto-generated constructor stub
//		delete();
//		insertdata();
//		getdata();
//		updatenamedata();
		
		rs = dbcon.getaddressname();
		try {
			while(rs.next()) {
				listcontent.add(rs.getObject(2).toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String string : listcontent) {
			System.out.println(string);
		}
		
		list = new JList<String>(listcontent);
		
		add(new JScrollPane(list));	
//		setTitle("Calculator");
		setResizable(false);
		setSize(600,75);
		setLayout(new GridLayout(1,2,10, 0));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

	private void insertdata() {
		// TODO Auto-generated method stub
		dbcon.insertuser(); // sourcecode ada di Db.java
	}
	
	private void getdata() {
		// TODO Auto-generated method stub
		// sourcode getdata terdapat di Db.java
		Vector<Vector<Object>> records = new Vector<Vector<Object>>();
		rs = dbcon.getdata();
		
		try {
			while (rs.next()) {
				Vector<Object> record = new Vector<Object>();
				record.add(rs.getObject(3));
				record.add(rs.getObject(1));
				record.add(rs.getObject("PASSWORD"));
				records.add(record);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Vector<Object> vector : records) {
			System.out.println("USER ID = " + vector.get(0));
			System.out.println("USER NAME = " + vector.get(1));
			System.out.println("PASSWORD = " + vector.get(2));
			System.out.println("\n===============================\n");
		}
	}
	
	private void updatenamedata() {
		// TODO Auto-generated method stub
		dbcon.updatename("002", "Elvin Sestomi");
	}
	
	private void delete() {
		// TODO Auto-generated method stub
		dbcon.deletedata("002");
	}
	
}
