package qwikflix

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(QuoteService)
class QuoteServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

     void "test something"() {
    	given: "A set of numbers"
		int a = 7
		int b = 4
		
		when: "The numbers are summed"
		int c = a + b
		
		then: "The answer is the sum of values"
		c == 11
	}
}
