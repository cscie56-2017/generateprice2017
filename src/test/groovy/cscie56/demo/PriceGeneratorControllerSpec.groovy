package cscie56.demo

import cscsie56.demo.plugin.PriceGeneratorService
import grails.test.mixin.TestFor
import spock.lang.Specification
import spock.lang.Unroll

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(PriceGeneratorController)
class PriceGeneratorControllerSpec extends Specification {

    PriceGeneratorService priceGeneratorService

    def setup() {
        priceGeneratorService = new PriceGeneratorService()
        controller.priceGeneratorService = priceGeneratorService
    }

    def cleanup() {
    }

    def "test null generate price"() {
        when:
            controller.generatePrice(null)
        then:
            response.text == "['null':'genre is required parameter']"
    }

    @Unroll
    void "test generate price (#price) by genre (#genre)"() {

        when:
            controller.generatePrice(genre)
        then:
             response.text == "['${genre}':${price}]"
        
        where:
        genre               | price
        'Horror'            |  795
        'Science Fiction'   |  595
        'Mystery'           |  895
        'Biography'         |  995
        'Textbook'          |19999
        'Satire'            | 2499
        'Drama'             |  499
        'Romance'           |  299
        'Poetry'            | 1999
        'Art'               | 2999
        
    }
}
