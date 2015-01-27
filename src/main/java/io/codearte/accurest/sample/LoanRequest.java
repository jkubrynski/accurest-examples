package io.codearte.accurest.sample;

/**
 * @author Jakub Kubrynski
 */
public class LoanRequest {

	private Client client;
	private Integer loanApplicationId;
	private Double amount;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Integer getLoanApplicationId() {
		return loanApplicationId;
	}

	public void setLoanApplicationId(Integer loanApplicationId) {
		this.loanApplicationId = loanApplicationId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
