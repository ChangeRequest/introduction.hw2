package school.lemon.changerequest.java.hw2

import spock.lang.Specification



public abstract class ArraySpecification extends Specification {
    def i(int ... args) {
        return args as int[]
    }
}