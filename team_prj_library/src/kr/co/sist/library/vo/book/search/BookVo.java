package kr.co.sist.library.vo.book.search;

public class BookVo {
	
	private String bookName, bookWriter, bookCo, bookYear;

	
	public BookVo() {
		// TODO Auto-generated constructor stub
	}//���ھ��� ������


	public BookVo(String bookName, String bookWriter, String bookCo, String bookYear) {
		super();
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.bookCo = bookCo;
		this.bookYear = bookYear;
	}//�����ִ� ������

	
	////////////getter setter//////////////

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
