package com.nextflow.plugin

import nextflow.Session
import spock.lang.Specification

class ExampleFunctionsTest extends Specification {

    def 'should return random string' () {
        given:
        def example = new ExampleFunctions()
        example.init(new Session([:]))

        when:
        def result = example.randomString(9)
        println result

        then:
        result.size()==9
    }
}