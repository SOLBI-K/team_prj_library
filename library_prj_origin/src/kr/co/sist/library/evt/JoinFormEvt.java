package kr.co.sist.library.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JoinFormEvt implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * 회원가입 완료
	 */
	public void okJoin(){
		
	}//okJoin
	
	
	/**
	 * 회원가입 취소
	 */
	public void cancelJoin(){
		
	}//calcelJoin
	
	
	/**
	 * ID 중복 확인
	 * @param memberId
	 * @return
	 */
	public boolean isDupID( String memberId ){
		boolean duplicated=false;
		
		return duplicated;
	}//isDupId
	
	
	/**
	 * 회원가입시 과거 가입이력 확인
	 * @return withdraw
	 */
	public boolean isWithdrawID(){
		boolean withdraw=false;
		
		return withdraw;
	}//isWithdrawID 
	
}//class
