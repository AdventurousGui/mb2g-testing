package guru.springframework

import spock.lang.Specification

class JavaHelloWorldTest extends Specification {
    def "GetHello"() {
        when:
        def foo = "123"

        then:
        true
    }
}
