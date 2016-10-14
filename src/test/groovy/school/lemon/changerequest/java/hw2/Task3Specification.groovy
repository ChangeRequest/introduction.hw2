package school.lemon.changerequest.java.hw2

import spock.lang.Specification
import spock.lang.Unroll


class Task3Specification extends Specification {
    @Unroll
    def "comboString should return '#expectedResult' for s1='#s1' and s2='#s2'"() {
        expect:
        Task3.comboString(s1, s2) == expectedResult
        where:
        s1           | s2         || expectedResult
        "Hello"      | "hi"       || "hiHellohi"
        "hi"         | "Hello"    || "hiHellohi"
        null         | "NotNull"  || "nullNotNullnull"
        "NotNull"    | null       || "nullNotNullnull"
        ""           | ""         || ""
        ""           | "notEmpty" || "notEmpty"
        " "          | "notEmpty" || " notEmpty "
        "test"       | "test1"    || "testtest1test"
        "\""         | "xml"      || "\"xml\""
        "123"        | "txt1"     || "123txt1123"
        "\u00DFetta" | "beta"     || "beta\u00DFettabeta"
        "   "        | "  "       || "       "
    }
}