package kr.co.sist.library.vo.book.member;

public class MyReqVO {

	private String reqNum, bookName, bookWriter, bookCo, reqState;

	public MyReqVO() {
		super();
	}

	public MyReqVO(String reqNum, String bookName, String bookWriter, String bookCo, String reqState) {
		super();
		this.reqNum = reqNum;
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.bookCo = bookCo;
		this.reqState = reqState;
	}
	
	
	////////////getter setter////////////////////////
	

	public String getReqNum() {
		return reqNum;
	}

	public void setReqNum(String reqNum) {
		this.reqNum = reqNum;
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

	public String getReqState() {
		return reqState;
	}

	public void setReqState(String reqState) {
		this.reqState = reqState;
	}
	
	
	
}//class
