package pert2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import pert4.Db;

public class LoginFrame extends JFrame implements ActionListener{

	JPanel north, center, south;
	JLabel Header, username, password;
	JTextField userf;
	JPasswordField passf;
	JButton submit;
	boolean valid;
	ResultSet rs;
	Db dbcon = new Db();
	Vector<Vector<Object>> records = new Vector<Vector<Object>>();
	
	public LoginFrame() {
		// TODO Auto-generated constructor stub
		getdata();
		passf = new JPasswordField();
//		passf.setEchoChar('*');
		
		//north
		north = new JPanel();
		Header = new JLabel("Login Page");
		Header.setFont(new Font("Serif", Font.BOLD, 30));
		north.add(Header);
		
		//center
		center = new JPanel(new GridLayout(2,2,0,10));
		center.setBorder(new EmptyBorder(10,20,10,20));
		username = new JLabel("User Name");
		password = new JLabel("Password");
		
		userf = new JTextField();
		userf.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (!(username.getText().isEmpty() || String.valueOf(passf.getPassword()).isEmpty())) {
						System.out.println("ini di key pressed anonymous class");
							String username = userf.getText();
							String password = String.valueOf(passf.getPassword());
							System.out.println("username adalah " + username + "\nPassword adalah " + password); 
					} else {
							JOptionPane.showMessageDialog(null, "masih ada yg kosong", "Erorr", JOptionPane.ERROR_MESSAGE);
						}

					
				}
			}
		});
		passf = new JPasswordField();
//		passf.addKeyListener(this);
//		passf.setPreferredSize(new Dimension(175,20));
//		JPanel bungkuspssf = new JPanel();
//		bungkuspssf.add(passf);
		
		center.add(username);
		center.add(userf);
		center.add(password);
		center.add(passf);
		
		//south 
		south = new JPanel();
		
		
		
		submit = new JButton("Submit");
		submit.setBackground(Color.gray.brighter());
		submit.addActionListener(this);
//		submit.addMouseListener(new MouseListener() {
//			
//			@Override
//			public void mouseReleased(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mousePressed(MouseEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void mouseExited(MouseEvent e) {
//				// TODO Auto-generated method stub
//				submit.setBackground(Color.gray.brighter());
//			}
//			
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				// TODO Auto-generated method stub
//				submit.setBackground(Color.gray.darker());
//			}
//			
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				// TODO Auto-generated method stub
//				if (username.getText().isEmpty() || String.valueOf(passf.getPassword()).isEmpty()) {
//					JOptionPane.showMessageDialog(null, "masih ada yg kosong", "Erorr", JOptionPane.ERROR_MESSAGE);
////					boolean valid = false;
//				} else {
//					String username = userf.getText();
//					String password = String.valueOf(passf.getPassword());
//					System.out.println("username adalah " + username + "\nPassword adalah " + password);
//				}
//			}
//		});
		
		south.add(submit);
		
		add(north, BorderLayout.NORTH);
		add(center, BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);
		setTitle("Login Page");
		setResizable(false);
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private boolean validateuser() {
		// TODO Auto-generated method stub
		
		valid = false;
		String username = userf.getText();
		String password = String.valueOf(passf.getPassword());
		for (Vector<Object> vector : records) {
			System.out.println(username.equals(vector.get(1)));
			System.out.println(password.equals(vector.get(2)));
			if (username.equals(vector.get(1))) {
				
				if (password.equals(vector.get(2))) {
					System.out.println("Selamat datang");
					valid = true;
					break;
				}
			}
		}
		
		return valid;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == submit) {
			System.out.println("Masuk");
			// block + alt + shift + z shortcut untuk membuat kondisi
				String username = userf.getText();
				String password = String.valueOf(passf.getPassword());
				if (validateuser()) {
					System.out.println("Username n password benar");
				} else {
					System.out.println("Username atau password salah");
				}
				
				System.out.println("username adalah " + username + "\nPassword adalah " + password);
		}
	}
	
	private void getdata() {
		// TODO Auto-generated method stub
		// sourcode getdata terdapat di Db.java
//		Vector<Vector<Object>> records = new Vector<Vector<Object>>();
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

//	@Override
//	public void keyPressed(KeyEvent e) {
//		// TODO Auto-generated method stub
//		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
//			System.out.println("ini di unimplemented method");
//			if(!(username.getText().isEmpty() || String.valueOf(passf.getPassword()).isEmpty())) {
//				String username = userf.getText();
//				String password = String.valueOf(passf.getPassword());
//				System.out.println("username adalah " + username + "\nPassword adalah " + password);
//			} else {
//				JOptionPane.showMessageDialog(this, "masih ada yg kosong", "Erorr", JOptionPane.ERROR_MESSAGE);
//			}
//		}
//	}
//
//	@Override
//	public void keyReleased(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void keyTyped(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
//	
	

}
