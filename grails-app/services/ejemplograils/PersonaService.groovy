package ejemplograils

import grails.transaction.Transactional
import groovy.util.logging.Log4j

@Transactional
@Log4j
class PersonaService {

    def encontrarPersona(id) {
        log.info("Servicio $id")
        Persona.findById(id)
    }

    def todos(){
        Persona.findAll()
    }
}
