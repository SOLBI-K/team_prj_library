package kr.co.sist.library.vo.book.member;

public class IdBookVO {

	private String memberID, bookNum;

	public IdBookVO() {
		super();
	}

	public IdBookVO(String memberID, String bookNum) {
		super();
		this.memberID = memberID;
		this.bookNum = bookNum;
	}

	
	///////////////getter setter////////////////////
	
	
	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getBookNum() {
		return bookNum;
	}

	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}
	
}//class
