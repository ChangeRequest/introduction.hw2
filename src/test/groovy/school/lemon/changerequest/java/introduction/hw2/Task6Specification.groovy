package school.lemon.changerequest.java.introduction.hw2

import spock.lang.Unroll


class Task6Specification extends ArraySpecification {
    @Unroll
    def "reverse should return #expectedResult for given array #arr"() {
        expect:
        Task6.reverse(arr) == expectedResult
        where:
        arr                           || expectedResult
        i(1, 2, 3)                    || i(3, 2, 1)
        i(-1, -2, -3, -4, 1, 2, 3, 4) || i(4, 3, 2, 1, -4, -3, -2, -1)
        i(0, 0, 0, 0)                 || i(0, 0, 0, 0)
        i(0, 2, 0, 0)                 || i(0, 0, 2, 0)
        i(-1)                         || i(-1)
        i(-1, 0)                      || i(0, -1)
        null                          || null
        i(1, 2, 3, 4, 5)              || i(5, 4, 3, 2, 1)
    }


}