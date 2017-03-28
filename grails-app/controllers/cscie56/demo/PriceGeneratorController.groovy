package cscie56.demo

import cscsie56.demo.plugin.PriceGeneratorService
import grails.converters.JSON

class PriceGeneratorController {

    PriceGeneratorService priceGeneratorService

    def generatePrice(String genre) {
        if (genre) {
            render([(genre): "${priceGeneratorService.setPriceByGenre(genre)}"]) as JSON
        } else {
            render ([null:"genre is required parameter"]) as JSON
        }
    }
}
