package school.lemon.changerequest.java.introduction.hw2

import spock.lang.Specification
import spock.lang.Unroll

class Task2Specification extends Specification {
    @Unroll
    def "firstTwo should return '#expectedResult' for given string '#s'"() {
        expect:
        Task2.firstTwo(s) == expectedResult
        where:
        s        || expectedResult
        "Hello"  || "He"
        ""       || ""
        "X"      || "X"
        "  Text" || "  "
        " Text"  || " T"
        "\"Hi\"" || "\"H"
        ".  "    || ". "
        null     || null
    }
}