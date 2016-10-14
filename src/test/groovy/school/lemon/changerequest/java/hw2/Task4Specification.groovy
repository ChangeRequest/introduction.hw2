package school.lemon.changerequest.java.hw2

import spock.lang.Specification
import spock.lang.Unroll


class Task4Specification extends Specification {
    @Unroll
    def "charAt should return '#expectedResult' for index='#i' and s='#s'"() {
        expect:
        Task4.charAt(s, i) == expectedResult
        where:
        s                 | i   || expectedResult
        "Hello"           | 0   || "H"
        "Hello"           | -1  || "o"
        "Hello"           | -6  || "o"
        "Hello"           | 6   || "e"
        "This is text"    | 4   || " "
        "-1 is minus one" | -1  || "e"
        "-1 is minus one" | 0   || "-"
        "-1 is minus one" | 15  || "-"
        "-1 is minus one" | 14  || "e"
        "-1 is minus one" | 16  || "1"
        "-1 is minus one" | -15 || "-"
        "-1 is minus one" | -14 || "1"
        "-1 is minus one" | -16 || "e"
    }
}