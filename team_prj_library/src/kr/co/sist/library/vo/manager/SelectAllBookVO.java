package kr.co.sist.library.vo.manager;

public class SelectAllBookVO {

	private String bookNum, bookName, bookWriter, bookCo, bookYear;

	public SelectAllBookVO() {
		super();
	}

	public SelectAllBookVO(String bookNum, String bookName, String bookWriter, String bookCo, String bookYear) {
		super();
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.bookCo = bookCo;
		this.bookYear = bookYear;
	}

	
	////////getter setter////////////////////
	
	
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
	
}//class
