package school.lemon.changerequest.java.introduction.hw2

import spock.lang.Unroll


class Task7Specification extends ArraySpecification {
    @Unroll
    def "countEvens should return #expectedResult for given array #arr"() {
        expect:
        Task7.countEvens(arr) == expectedResult
        where:
        arr                                                      || expectedResult
        i(1, 3, 5)                                               || 0
        i(2, 4, 6)                                               || 3
        i(0, 0, 0)                                               || 3
        i(0, 0, -2)                                              || 3
        i(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16) || 8
        i(12345678)                                              || 1
        i(12345678, -345678, 0, -1, -2, -3, -4, -5, 6)           || 6
        i(null)                                                  || 0
        i(-1, 2, -3, 4, 5, -6)                                   || 3
    }
}