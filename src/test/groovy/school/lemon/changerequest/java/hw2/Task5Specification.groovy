package school.lemon.changerequest.java.hw2

import spock.lang.Specification
import spock.lang.Unroll


class Task5Specification extends ArraySpecification {
    @Unroll
    def "commonEnd should return #expectedResult for a=#a and b=#b"() {
        expect:
        Task5.commondEnd(a, b) == expectedResult
        where:
        a                                                                 | b                || expectedResult
        i(1)                                                              | i(2)             || false
        i(1, 2)                                                           | i(2)             || true
        i(1, 2)                                                           | i(1)             || true
        i(1, 2, 3)                                                        | i(2, 3, 1)       || true
        i(1, 2, 3)                                                        | i(3, 3, 3)       || true
        i(3, 2, 3)                                                        | i(1, 2, 1)       || false
        i(3, 2, 3, 1, 213, 0, 5, 3, 64, 8, 568, 2, 4, 15, -1, 124, -1245) | i(-1245)         || true
        i(3, 2, 3, 1, 213, 0, 5, 3, 64, 8, 568, 2, 4, 15, -1, 124, -1245) | i(3)             || true
        i(3, 2, 3, 1, 213, 0, 5, 3, 64, 8, 568, 2, 4, 15, -1, 124, -1245) | i(1, 2, 3, 4, 3) || true
    }
}