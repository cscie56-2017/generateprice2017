package cscsie56.demo.plugin

import grails.transaction.Transactional

@Transactional
class PriceGeneratorService {

    /**
     * Set a default book price based on genre, ONLY IF price has not already been set <br/>
     * Since adding a price could change an invalid book object's status from invalid to valid, clear errors and re-validate
     * @param book
     * @return
     */
    def setPriceByGenre(String genre) {
        Map priceMap = ['Horror':795,
                        'Science Fiction':595,
                        'Mystery':895,
                        'Biography':995,
                        'Textbook':19999,
                        'Satire':2499,
                        'Drama':499,
                        'Romance':299,
                        'Poetry':1999,
                        'Art':2999]

        return priceMap[(genre)]
    }
}
