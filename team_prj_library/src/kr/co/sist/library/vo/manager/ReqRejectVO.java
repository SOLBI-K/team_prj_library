package kr.co.sist.library.vo.manager;

public class ReqRejectVO {

	private String reqState, rejectReason;

	public ReqRejectVO() {
		super();
	}

	public ReqRejectVO(String reqState, String rejectReason) {
		super();
		this.reqState = reqState;
		this.rejectReason = rejectReason;
	}

	
	////////getter setter////////////////
	
	
	public String getReqState() {
		return reqState;
	}

	public void setReqState(String reqState) {
		this.reqState = reqState;
	}

	public String getRejectReason() {
		return rejectReason;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	
}//class
