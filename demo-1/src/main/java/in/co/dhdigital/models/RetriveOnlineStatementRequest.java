package in.co.dhdigital.models;

public class RetriveOnlineStatementRequest {
	
	String accountNumber;
	String fromDate;
	String toDate;
	String restartRecNo;
	String restartAmount;
	String exemptCharge;
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getRestartRecNo() {
		return restartRecNo;
	}
	public void setRestartRecNo(String restartRecNo) {
		this.restartRecNo = restartRecNo;
	}
	public String getRestartAmount() {
		return restartAmount;
	}
	public void setRestartAmount(String restartAmount) {
		this.restartAmount = restartAmount;
	}
	public String getExemptCharge() {
		return exemptCharge;
	}
	public void setExemptCharge(String exemptCharge) {
		this.exemptCharge = exemptCharge;
	}

}
