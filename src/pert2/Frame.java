package pert2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Frame extends JFrame{

	public Frame() {
		// TODO Auto-generated constructor stub
		Font font = new Font("Dialog", Font.BOLD, 30);
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
//		setLayout(new GridBagLayout());
		setLocationRelativeTo(null);
		setTitle("Frame2");
		JLabel label = new JLabel("Hello world", SwingConstants.CENTER);
		label.setFont(font);
		label.setForeground(Color.BLUE);
		add(label, BorderLayout.CENTER);

	}

}
