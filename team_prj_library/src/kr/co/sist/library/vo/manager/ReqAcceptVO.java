package kr.co.sist.library.vo.manager;

public class ReqAcceptVO {
	
	private String bookNum, bookName, bookWriter, bookCo, 
			bookYear, bookImg;

	public ReqAcceptVO() {
		super();
	}

	public ReqAcceptVO(String bookNum, String bookName, String bookWriter, String bookCo, String bookYear,
			String bookImg) {
		super();
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.bookCo = bookCo;
		this.bookYear = bookYear;
		this.bookImg = bookImg;
	}

	
	///////////getter setter/////////////////
	
	
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

	public String getBookYear() {
		return bookYear;
	}

	public void setBookYear(String bookYear) {
		this.bookYear = bookYear;
	}

	public String getBookImg() {
		return bookImg;
	}

	public void setBookImg(String bookImg) {
		this.bookImg = bookImg;
	}
	
	
}//class
