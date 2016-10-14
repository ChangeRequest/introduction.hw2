package school.lemon.changerequest.java.hw2

import spock.lang.Specification
import spock.lang.Unroll


class Task8Specification extends ArraySpecification {
    @Unroll
    def "evenOdd should return #expectedResult for given array #arr"() {
        expect:
        Task8.evenOdd(arr) == expectedResult
        where:
        arr                          || expectedResult
        i(1, 2, 3)                   || i(2, 1, 3)
        i(2, 4, 6)                   || i(2, 4, 6)
        i(-1, 2, -3, 4)              || i(2, 4, -1, -3)
        i(0, 0, 0, 1, 1, 1)          || i(0, 0, 0, 1, 1, 1)
        i(0, 0, 0, 1, 1, 1, 0, 0, 0) || i(0, 0, 0, 0, 0, 0, 1, 1, 1)
        null                         || null

    }
}