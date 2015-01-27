package io.codearte.accurest.sample;

/**
 * @author Jakub Kubrynski
 */
public class LoanResponse {

	private String loanApplicationStatus;
	private Integer loanApplicationId;

	public String getLoanApplicationStatus() {
		return loanApplicationStatus;
	}

	public void setLoanApplicationStatus(String loanApplicationStatus) {
		this.loanApplicationStatus = loanApplicationStatus;
	}

	public Integer getLoanApplicationId() {
		return loanApplicationId;
	}

	public void setLoanApplicationId(Integer loanApplicationId) {
		this.loanApplicationId = loanApplicationId;
	}
}
