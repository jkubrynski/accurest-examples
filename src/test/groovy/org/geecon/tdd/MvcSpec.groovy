package org.geecon.tdd

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc
import io.codearte.accurest.sample.FraudController
import spock.lang.Specification

/**
 * @author Jakub Kubrynski
 */
class MvcSpec extends Specification {

	def setup() {
		RestAssuredMockMvc.standaloneSetup(new FraudController())
	}

}
