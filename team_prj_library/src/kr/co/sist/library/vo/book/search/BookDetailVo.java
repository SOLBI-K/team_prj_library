package kr.co.sist.library.vo.book.search;

public class BookDetailVo {
	
	private String booName, bookWriter, bookCo, bookYear, bookImg;
	
	public BookDetailVo() {
		// TODO Auto-generated constructor stub
	}//인자 없는 생성자
	
	public BookDetailVo(String booName, String bookWriter, String bookCo, String bookYear, String bookImg) {
		super();
		this.booName = booName;
		this.bookWriter = bookWriter;
		this.bookCo = bookCo;
		this.bookYear = bookYear;
		this.bookImg = bookImg;
	}//인자있는 생성자



	//////////getter setter///////////////////////
	
	public String getBooName() {
		return booName;
	}

	public void setBooName(String booName) {
		this.booName = booName;
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
