package kr.co.sist.library.form.main;


import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class DetailSchForm extends JFrame {
	
	private JPanel pnTitle, pnWriter, pnYear, pnCo; 
	private JLabel lblTitle, lblWriter, lblYear, lblCo, lblImg;
	private JTextField jtfTitle, jtfWriter, jtfYear, jtfCo;
	private JTextArea jtaList;
	private JScrollPane reviewList;
	private JButton btnBorrow;
	private DefaultTableModel dtmBorrow;
	private JTable tbBorrow;

	
	public DetailSchForm() {
		super("library");
		setLayout(null);
		
		lblImg=new JLabel(new ImageIcon("C:/dev/workspace/library_prj/src/view/자바의 정석.jpg"));

		lblTitle=new JLabel("제목: ");
		jtfTitle=new JTextField();
		lblWriter=new JLabel("저자: ");
		jtfWriter=new JTextField();
		lblYear=new JLabel("출판년도 : ");
		jtfYear=new JTextField();
		lblCo=new JLabel("출판사");
		jtfCo=new JTextField();
		
		pnTitle=new JPanel();
		pnTitle.setLayout(new GridLayout(1, 2));
		
		pnTitle.add(lblTitle);
		pnTitle.add(jtfTitle);

		pnWriter=new JPanel();
		pnWriter.setLayout(new GridLayout(1, 2));

		pnWriter.add(lblWriter);
		pnWriter.add(jtfWriter);
		
		pnYear=new JPanel();
		pnYear.setLayout(new GridLayout(1, 2));
		
		pnYear.add(lblYear);
		pnYear.add(jtfYear);
		
		pnCo=new JPanel();
		pnCo.setLayout(new GridLayout(1, 2));
		
		pnCo.add(lblCo);
		pnCo.add(jtfCo);
		
		JButton btnBorrow=new JButton("대출");
		
		jtaList=new JTextArea();
		
		
		reviewList=new JScrollPane(jtaList);
		reviewList.setBorder(new TitledBorder("review"));
		
		String[] columnNames={"번호","대출가능 여부"};
		String[][] data={};
		dtmBorrow=new DefaultTableModel(data,columnNames);
		tbBorrow=new JTable(dtmBorrow);
		
		tbBorrow.getColumnModel().getColumn(0).setPreferredWidth(100);
		tbBorrow.getColumnModel().getColumn(1).setPreferredWidth(200);
		
		JScrollPane scroll=new JScrollPane(tbBorrow);
		
		lblImg.setBounds(50, 50, 200, 230);
		pnTitle.setBounds(320, 80, 200, 30);
		pnWriter.setBounds(320, 130, 200, 30);
		pnYear.setBounds(320, 180, 200, 30);
		pnCo.setBounds(320, 230, 200, 30);
		btnBorrow.setBounds(420, 300, 100, 30);
		reviewList.setBounds(40, 400, 500, 270);
		scroll.setBounds(60, 290, 300, 100);
		
		add(lblImg);
		add(pnTitle);
		add(pnWriter);
		add(pnYear);
		add(pnCo);
		add(reviewList);
		add(btnBorrow);
		add(scroll);
		
		setBounds(100, 100, 600, 800);
		setBackground(new Color(000000));
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		
	
	}//con
	
	
	public static void main(String[] args) {
		new DetailSchForm();
		System.out.println(123124);
	}//main

}//class
