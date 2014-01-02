package com.grailsinaction

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Saving our first user to the database"() {
    	given: "A brand new user"
		def joe = new User(loginId: 'joe',password:'secret',
			homepage:'http://www.grailsinaction.com')
		
		when: "That user is saved"
		joe.save()
		
		then: "it saved successfully and can be found in the database"
		joe.errors.errorCount == 0
		joe.id != null
		User.get(joe.id).loginId == joe.loginId
	}
}
