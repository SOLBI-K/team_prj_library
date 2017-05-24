package kr.co.sist.library.vo.manager;

public class BookDetailVO {

	private String bookName, bookWriter, bookCo, bookYear, bookImg;

	public BookDetailVO() {
		super();
	}

	public BookDetailVO(String bookName, String bookWriter, String bookCo, String bookYear, String bookImg) {
		super();
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.bookCo = bookCo;
		this.bookYear = bookYear;
		this.bookImg = bookImg;
	}
	
	
	///////////getter setter///////////////////////
	

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
