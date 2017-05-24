package kr.co.sist.library.vo.book.search;

public class BookReviewVo {

	private String review, mamberID, inputdate;

	public BookReviewVo() {
		super();
	}

	public BookReviewVo(String review, String mamberID, String inputdate) {
		super();
		this.review = review;
		this.mamberID = mamberID;
		this.inputdate = inputdate;
	}

	
	
	//////////getter setter//////////////////

	
	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getMamberID() {
		return mamberID;
	}

	public void setMamberID(String mamberID) {
		this.mamberID = mamberID;
	}

	public String getInputdate() {
		return inputdate;
	}

	public void setInputdate(String inputdate) {
		this.inputdate = inputdate;
	}

}//class
