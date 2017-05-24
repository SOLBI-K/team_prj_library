package kr.co.sist.library.vo.member;

public class LoginVo {
	
	private String memberID, memberPW;

	public LoginVo() {
		super();
	}

	public LoginVo(String memberID, String memberPW) {
		super();
		this.memberID = memberID;
		this.memberPW = memberPW;
	}
	
	
	////////////getter setter//////////////////
	
	

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getMemberPW() {
		return memberPW;
	}

	public void setMemberPW(String memberPW) {
		this.memberPW = memberPW;
	}
	
}//class
