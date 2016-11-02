package school.lemon.changerequest.java.introduction.hw2

import spock.lang.Specification
import spock.lang.Unroll


class Task1Specification extends Specification {

    @Unroll
    def "makeTags should produce '#expectedResult' for tag='#tag' and text='#text'"() {
        expect:
        Task1.makeTags(tag, text) == expectedResult
        where:
        tag      | text                      || expectedResult
        "i"      | "Y ay"                    || "<i>Y ay</i>"
        "xml"    | "Text"                    || "<xml>Text</xml>"
        "\""     | "\'\"\'"                  || "<\">\'\"\'</\">"
        "1"      | "123"                     || "<1>123</1>"
        "<"      | "123"                     || "<<>123</<>"
        "\\"     | "\\"                      || "<\\>\\</\\>"
        "/"      | "\\/"                     || "</>\\/<//>"
        "\u00DF" | "Text"                    || "<\u00DF>Text</\u00DF>"
        "<>"     | "Long long text with <>." || "<<>>Long long text with <>.</<>>"
        ""       | ""                        || "<></>"
        "   "    | "   "                     || "<   >   </   >"
        null     | "Text"                    || "<null>Text</null>"
        ""       | null                      || "<>null</>"
        null     | null                      || "<null>null</null>"
        "null"   | "null"                    || "<null>null</null>"
    }
}
