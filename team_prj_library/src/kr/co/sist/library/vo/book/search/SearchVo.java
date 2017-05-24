package kr.co.sist.library.vo.book.search;

public class SearchVo {

	private String bookAttr, inputText;

	public SearchVo() {
		super();
	}

	public SearchVo(String bookAttr, String inputText) {
		super();
		this.bookAttr = bookAttr;
		this.inputText = inputText;
	}
	
	
	/////////////getter setter////////////////////
	

	public String getBookAttr() {
		return bookAttr;
	}

	public void setBookAttr(String bookAttr) {
		this.bookAttr = bookAttr;
	}

	public String getInputText() {
		return inputText;
	}

	public void setInputText(String inputText) {
		this.inputText = inputText;
	}
	
}//class
