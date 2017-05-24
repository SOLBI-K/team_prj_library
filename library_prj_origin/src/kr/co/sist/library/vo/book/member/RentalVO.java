package kr.co.sist.library.vo.book.member;

public class RentalVO {

	private String bookName, bookWriter, bookCo, bookYear, returnDate, currentState;

	public RentalVO() {
		super();
	}

	public RentalVO(String bookName, String bookWriter, String bookCo, String bookYear, String returnDate,
		String currentState) {
		this.bookName = bookName;
		this.bookWriter = bookWriter;
		this.bookCo = bookCo;
		this.bookYear = bookYear;
		this.returnDate = returnDate;
		this.currentState = currentState;
	}

	//////////// getter setter////////////////

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

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public String getCurrentState() {
		return currentState;
	}

	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}

}// class
