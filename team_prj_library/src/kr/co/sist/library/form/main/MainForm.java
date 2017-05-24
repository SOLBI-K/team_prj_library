package kr.co.sist.library.form.main;

import java.awt.Choice;
import java.awt.Color;
import java.text.ChoiceFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class MainForm extends JFrame {
	
	private JButton btnEnroll, btnLogin, btnEnter, btnBook;
	private JTextField jtfSearch;
	private Choice chSearch;
	
	public MainForm() {
		super("Library");
		
		btnEnroll=new JButton("����");
		btnLogin=new JButton("�α���");
		btnEnter=new JButton("�˻�");
		
		btnEnroll.setBounds(480, 20, 75, 30);
		btnLogin.setBounds(580, 20, 75, 30);
		btnEnter.setBounds(570, 100, 80, 25);
		
//		String[] search={"������","����","Ű����"};
		chSearch=new Choice();
		chSearch.add("������");
		chSearch.add("����");
		chSearch.add("Ű����");
		chSearch.setBounds(50, 100, 80, 50);
		
		jtfSearch=new JTextField("�˻�� �Է��ϼ���");
		jtfSearch.setBounds(150, 100, 420, 25);
		
		btnBook=new JButton(new ImageIcon("C:/dev/workspace/analysis_prj(team1)/src/team1_0412/firefox.jpg"));
		btnBook.setBounds(150, 180, 420, 250);
		
		add(btnEnroll);
		add(btnLogin);
		add(btnEnter);
		add(chSearch);
		add(jtfSearch);
		add(btnBook);
		
		setBounds(200, 200, 700, 500);
//		setBackground(Color.WHITE);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	}//con
	
	
	
	public static void main(String[] args) {
		new MainForm();
	}//main

}//class
