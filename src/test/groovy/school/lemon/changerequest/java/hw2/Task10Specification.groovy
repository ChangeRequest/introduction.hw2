package school.lemon.changerequest.java.hw2

import spock.lang.Specification
import spock.lang.Unroll


class Task10Specification extends Specification {
    @Unroll
    def "trim should return '#expectedResult' for given text '#text'"() {
        expect:
        Task10.trim(text) == expectedResult
        where:
        text                                                                                            || expectedResult
        ""                                                                                              || ""
        "\t\tThis is text with tabulations\t    .\t \t \t"                                              || "This is text with tabulations\t    ."
        " Very long text.  Very long text.  Very long text. \t Very long text. Very long text.        " || "Very long text.  Very long text.  Very long text. \t Very long text. Very long text."
        "Text, where nothing should be trimmed"                                                         || "Text, where nothing should be trimmed"
    }
}