package kr.co.sist.library.evt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JoinFormEvt implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * ȸ������ �Ϸ�
	 */
	public void okJoin(){
		
	}//okJoin
	
	
	/**
	 * ȸ������ ���
	 */
	public void cancelJoin(){
		
	}//calcelJoin
	
	
	/**
	 * ID �ߺ� Ȯ��
	 * @param memberId
	 * @return
	 */
	public boolean isDupID( String memberId ){
		boolean duplicated=false;
		
		return duplicated;
	}//isDupId
	
	
	/**
	 * ȸ�����Խ� ���� �����̷� Ȯ��
	 * @return withdraw
	 */
	public boolean isWithdrawID(){
		boolean withdraw=false;
		
		return withdraw;
	}//isWithdrawID 
	
}//class
