package org.example

import spock.lang.Specification

class HelloWorldGroovySpec extends Specification {
    def "GetHelloMessage"() {
        when:
            String msg = HelloWorldGroovy.helloMessage
        then:
            msg.equals("Hello from Groovy class property magic.")
    }
}
