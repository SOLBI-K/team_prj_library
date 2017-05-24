package kr.co.sist.library.vo.member;

public class MyModifyVo {

	private String memberPW, phone, like;

	public MyModifyVo() {
		super();
	}

	public MyModifyVo(String memberPW, String phone, String like) {
		super();
		this.memberPW = memberPW;
		this.phone = phone;
		this.like = like;
	}

	
	///////////////getter setter///////////////
	
	
	
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
