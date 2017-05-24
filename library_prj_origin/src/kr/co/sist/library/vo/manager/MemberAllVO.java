package kr.co.sist.library.vo.manager;

public class MemberAllVO {

	private String mamberID, phone, like, inputdate;

	public MemberAllVO() {
		super();
	}

	public MemberAllVO(String mamberID, String phone, String like, String inputdate) {
		super();
		this.mamberID = mamberID;
		this.phone = phone;
		this.like = like;
		this.inputdate = inputdate;
	}
	
	
	///////////getter setter//////////////////
	

	public String getMamberID() {
		return mamberID;
	}

	public void setMamberID(String mamberID) {
		this.mamberID = mamberID;
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

	public String getInputdate() {
		return inputdate;
	}

	public void setInputdate(String inputdate) {
		this.inputdate = inputdate;
	}
	
}//class
