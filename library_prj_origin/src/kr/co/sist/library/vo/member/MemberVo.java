package kr.co.sist.library.vo.member;

public class MemberVo {

	private String memberID, memberPW, phone, like;

	public MemberVo() {
		super();
	}

	public MemberVo(String memberID, String memberPW, String phone, String like) {
		super();
		this.memberID = memberID;
		this.memberPW = memberPW;
		this.phone = phone;
		this.like = like;
	}
	
	
	///////////getter setter///////////////////////
	
	

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLike() {
		return like;
	}

	public void setLike(String like) {
		this.like = like;
	}
	
}//class
