package kr.co.sist.library.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFormEvt implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}//actionPerformed

	
	/**
	 * 로그인시 아이디 검사
	 * @return
	 */
	public boolean checkID(){
		boolean id=false;
		
		return id;
	}//checkID
	
	
	/**
	 * 로그인시 비밀번호 검사
	 * @return
	 */
	public boolean checkPW(){
		boolean passWd=false;
		
		return passWd;
	}//checkPW
	
	
	/**
	 * 로그인 성공 
	 */
	public void okLogin(){
		
	}//cancelLogin
	
	
	/**
	 * 로그인 취소
	 */
	public void cancelLogin(){
		
	}//cancelLogin

}//class
