package school.lemon.changerequest.java.introduction.hw2

import spock.lang.Specification
import spock.lang.Unroll

class Task9Specification extends Specification {
    @Unroll
    def "extractData should return #expectedResult for given URL '#url'"() {
        expect:
        Task9.extractData(url) == expectedResult
        where:
        url                                                           || expectedResult
        "ftp://file_server.com:21/top_secret/life_changing_plans.pdf" || ["ftp", "file_server.com", "21"]
        "https://test.com/lesson/introduction#section"                || ["https", "test.com", ""]
        "file://localhost:4040/zip_file"                              || ["file", "localhost", "4040"]
        "https://s3cur3-server.com:9999/"                             || ["https", "s3cur3-server.com", "9999"]
        "market://search/angry%20birds"                               || ["market", "search", ""]
        "www.example.com"                                             || ["", "www.example.com", ""]
        "www.example.com:8080/test"                                   || ["", "www.example.com", "8080"]
        ""                                                            || ["", "", ""]
        null                                                          || ["", "", ""]
    }

}