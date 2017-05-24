package kr.co.sist.library.vo.book.member;

public class MemberReviewVO {

	private String memberID, comment, bookNum;

	public MemberReviewVO() {
		super();
	}

	public MemberReviewVO(String memberID, String comment, String bookNum) {
		super();
		this.memberID = memberID;
		this.comment = comment;
		this.bookNum = bookNum;
	}
	
	
	///////////getter setter/////////////
	

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getBookNum() {
		return bookNum;
	}

	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}
	
}//class
