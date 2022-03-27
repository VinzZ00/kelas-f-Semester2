package pert3;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Arrays;
import java.util.Vector;
import java.util.function.Consumer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Calculator_Sederhana extends JFrame{

	JPanel leftPane, rightPane, innerRightPane;
	Vector<String> historyvec;
	JList<String> history;
	JLabel result;

	JButton[] angka1_9 = new JButton[12];
	
	JButton plus, minus, kali, bagi;
	
	public Calculator_Sederhana() {
		// TODO Auto-generated constructor stub
		historyvec = new Vector<String>();
		historyvec.add("Test1");
		
		
		
//		leftPane = new JPanel();
		history	= new JList<>(historyvec);
		history.setBackground(Color.gray.darker());
//		leftPane.add(history);
		
		
		
		add(new JScrollPane(history));
		add(new JLabel("Test"));
		setTitle("Calculator");
		setResizable(false);
		setSize(600,600);
		setLayout(new GridLayout(1,2,10, 0));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	
	private void initangka() {
		// TODO Auto-generated method stub
		for (int i = 0; i < angka1_9.length; i++) {
			angka1_9[i] = new JButton(String.valueOf(i));
		}
		
//		
		
	}
	
	private void initop() {
		// TODO Auto-generated method stub
		plus = new JButton("Plus");
		minus = new JButton("Minus");
		kali = new JButton("Multiply");
		bagi = new JButton("Divide");
	}
}
