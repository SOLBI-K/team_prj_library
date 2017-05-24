package kr.co.sist.library.vo.book.member;

public class ReqVO {

	private String memberID, bookName, bookWriter, bookCo;

	public ReqVO() {
		super();
	}

	public ReqVO(String memberID, String bookName, String bookWriter, String bookCo) {
		super();
		this.memberID = memberID;
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.bookCo = bookCo;
	}

	
	///////////getter setter//////////////
	
	
	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookWriter() {
		return bookWriter;
	}

	public void setBookWriter(String bookWriter) {
		this.bookWriter = bookWriter;
	}

	public String getBookCo() {
		return bookCo;
	}

	public void setBookCo(String bookCo) {
		this.bookCo = bookCo;
	}
	
}//class
