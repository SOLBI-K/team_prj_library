package kr.co.sist.library.vo.book.search;

public class BookStateVo {
	
	private String bookNum, currentState;

	public BookStateVo() {
		super();
	}

	public BookStateVo(String bookNum, String currentState) {
		super();
		this.bookNum = bookNum;
		this.currentState = currentState;
	}

	
	/////////////getter setter///////////////////////
	
	
	public String getBookNum() {
		return bookNum;
	}

	public void setBookNum(String bookNum) {
		this.bookNum = bookNum;
	}

	public String getCurrentState() {
		return currentState;
	}

	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
	
}//class
