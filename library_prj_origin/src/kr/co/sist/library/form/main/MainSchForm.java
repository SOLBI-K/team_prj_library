package kr.co.sist.library.form.main;

import java.awt.Choice;
import java.awt.Color;
import java.text.ChoiceFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class MainSchForm extends JFrame {
	
	private JButton btnLogout, btnEnter, btnMypage;
	private JTextField jtfSearch;
	private Choice chSearch;
	private DefaultTableModel dtmList;
	private JTable bookList;
	private JScrollPane jsp;
	
	public MainSchForm() {
		super("Library");

		setLayout(null);
		
		String[] columnName={"번호","도서명","저자","출판사"};
		String[][] data={};
		
		dtmList=new DefaultTableModel(data, columnName){

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
			
		};//선택 못하게 하는 
		
		//컬럼을 선택하여 움직이지 못하도록 설정
//		bookList.getTableHeader().setReorderingAllowed(false);
		
		//컬럼의 높이 설정
//		bookList.setRowHeight(100);
		bookList=new JTable(dtmList);
		
		bookList.getColumnModel().getColumn(0).setPreferredWidth(40);
		bookList.getColumnModel().getColumn(1).setPreferredWidth(200);
		bookList.getColumnModel().getColumn(2).setPreferredWidth(100);
		bookList.getColumnModel().getColumn(3).setPreferredWidth(80);
		
		jsp=new JScrollPane(bookList);
		jsp.setBounds(50, 150, 600, 300);
		
		
		btnMypage=new JButton("마이페이지");
		btnLogout=new JButton("로그아웃");
		btnEnter=new JButton("검색");
		
		btnMypage.setBounds(450, 20, 100, 30);
		btnLogout.setBounds(560, 20, 90, 30);
		btnEnter.setBounds(570, 100, 80, 25);
		
		chSearch=new Choice();
		chSearch.add("도서명");
		chSearch.add("저자");
		chSearch.add("키워드");
		
		chSearch.setBounds(50, 100, 80, 50);
		
		jtfSearch=new JTextField("검색어를 입력하세요");
		jtfSearch.setBounds(150, 100, 420, 25);
		
		add(btnMypage);
		add(btnLogout);
		add(btnEnter);
		add(chSearch);
		add(jtfSearch);
		add(jsp);
		
		setBounds(200, 200, 700, 500);
		setBackground(Color.WHITE);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	}//con
	
	
	
	public static void main(String[] args) {
		new MainSchForm();
	}//main

}//class
