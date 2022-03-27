package pert2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub		
//		initframe();
		new LoginFrame();
	}
	
	private void initframe() {
		// TODO Auto-generated method stub
//		untuk frame default layout manager itu adalah border layout,
//		untuk Jpanel default layout manager itu adalah flow layout
		
		JFrame frame1 = new JFrame();
		frame1.setVisible(true);
		frame1.setSize(400,400);
		frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
		frame1.setResizable(false);
		frame1.setLayout(new GridBagLayout());
		frame1.setLocationRelativeTo(null);
		frame1.setTitle("Frame1");

		
		JButton button1 = new JButton("Butt1");
		JButton button2= new JButton("Butt2");
		JButton button3 = new JButton("Butt3");
		JButton button4 = new JButton("Butt4");
		JButton button5 = new JButton("Butt5");
		JButton button6 = new JButton("Butt6");
		JButton button7 = new JButton("Butt7");
//		JPanel panellabel = new JPanel();
//		panellabel.add(button1);
		
//		Pemakaian border layout
//		frame1.add(button1, BorderLayout.NORTH);
//		frame1.add(button2, BorderLayout.CENTER);
//		frame1.add(button3, BorderLayout.SOUTH);
//		frame1.add(button4, BorderLayout.EAST);
//		frame1.add(button5, BorderLayout.WEST);
		
		GridBagConstraints gbc = new GridBagConstraints(); 
		
		gbc.insets = new Insets(10, 20, 10, 20);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		gbc.gridx = 0;

		gbc.gridy = 0;
		button1.setPreferredSize(new Dimension(150,50));
		button2.setPreferredSize(new Dimension(150,50));
		button3.setPreferredSize(new Dimension(150,50));
		frame1.add(button1, gbc);
		
		gbc.gridx = 1;
		
		
		frame1.add(button2, gbc);
		gbc.gridy = 1;
		gbc.gridx = 0;
		gbc.gridwidth = 2;
		
		frame1.add(button3, gbc);
//		frame1.add(button4);
//		frame1.add(button5);
//		frame1.add(button6);
//		frame1.add(button7);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginFrame();
	}

}
