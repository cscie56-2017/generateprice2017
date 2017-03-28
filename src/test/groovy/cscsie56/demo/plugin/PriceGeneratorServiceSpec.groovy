package cscsie56.demo.plugin

import grails.test.mixin.TestFor
import spock.lang.Specification
import spock.lang.Unroll

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(PriceGeneratorService)
class PriceGeneratorServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    @Unroll
    def "testing setPriceByGenre: genre = #genre, expected price = #price" () {
        expect:
            price == service.setPriceByGenre(genre)

        where:
        genre               | price
        'Horror'            | 795
        'Science Fiction'   | 595
        'Mystery'           | 895
        'Biography'         | 995
        'Textbook'          | 19999
        'Satire'            | 2499
        'Drama'             | 499
        'Romance'           | 299
        'Poetry'            | 1999
        'Art'               | 2999
    }

}
