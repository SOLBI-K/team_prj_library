package kr.co.sist.library.vo.manager;

public class ReqAllVO {

	private String reqNum, bookNum, bookName, bookWriter, bookCo,
			mamberID, reqDate, reqState;

	public ReqAllVO() {
		super();
	}

	public ReqAllVO(String reqNum, String bookNum, String bookName, String bookWriter, String bookCo, String mamberID,
			String reqDate, String reqState) {
		super();
		this.reqNum = reqNum;
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.bookCo = bookCo;
		this.mamberID = mamberID;
		this.reqDate = reqDate;
		this.reqState = reqState;
	}
	
	
	////////////getter setter///////////////////
	
	

	public String getReqNum() {
		return reqNum;
	}

	public void setReqNum(String reqNum) {
		this.reqNum = reqNum;
	}

	public String getBookNum() {
		return bookNum;
	}

	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
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

	public String getMamberID() {
		return mamberID;
	}

	public void setMamberID(String mamberID) {
		this.mamberID = mamberID;
	}

	public String getReqDate() {
		return reqDate;
	}

	public void setReqDate(String reqDate) {
		this.reqDate = reqDate;
	}

	public String getReqState() {
		return reqState;
	}

	public void setReqState(String reqState) {
		this.reqState = reqState;
	}
	
}//class
