package io.codearte.accurest.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Jakub Kubrynski
 */
@Controller
public class FraudController {

	@RequestMapping(value = "/loanApplication", method = RequestMethod.PUT,
			consumes = {"application/vnd.loanapplicationservice.v1+json"},
			produces = {"application/vnd.loanapplicationservice.v1+json"})
	@ResponseBody
	public LoanResponse greeting(@RequestBody LoanRequest loanRequest) {
		LoanResponse loanResponse = new LoanResponse();
		loanResponse.setLoanApplicationId(loanRequest.getLoanApplicationId());
		loanResponse.setLoanApplicationStatus("LOAN_APPLIED");
		return loanResponse;
	}

}
