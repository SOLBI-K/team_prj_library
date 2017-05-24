package kr.co.sist.library.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ManagerFormEvt extends MouseAdapter implements ActionListener, ChangeListener {

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub

	}//stateChanged

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}//actionPerformed
	
	
	/**
	 * 관리자 - 모든 회원 조회
	 */
	public void lookupAllMember(){
		
	}//lookupAllMember

	
	/**
	 * 관리자 - 모든 도서 조회
	 */
	public void lookupAllBook(){
		
	}//lookupAllMember
	
	
	/**
	 * 관리자 - 모든 대출현황 조회
	 */
	public void lookupAllRental(){
		
	}//lookupAllMember
	
	
	/**
	 * 관리자 - 모든 도서신청 현황 조회
	 */
	public void lookupAllReq(){
		
	}//lookupAllMember
	
	
	/**
	 * 관리자 - 신청도서 거절하는 버튼 클릭
	 */
	public void addNewRejectBook(){
		
	}//addNewRejectBook

	
	/**
	 * 관리자 - 신청도서 승인하는 버튼 클릭
	 */
	public void addAcceptBook(){
		
	}//addAcceptBook
	
	
	/**
	 * 관리자 - 새로운 도서 추가하는 버튼 클릭
	 */
	public void addNewBook(){
		
	}//addNewBook
	

	/**
	 * 관리자 - 보유 도서 삭제하려는 액션
	 */
	public void removeBook(){
		
	}//removeBook

}//class
