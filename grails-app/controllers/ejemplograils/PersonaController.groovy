package ejemplograils

import grails.converters.JSON
import grails.rest.RestfulController
import groovy.util.logging.Log4j

@Log4j
class PersonaController extends RestfulController {

    PersonaService personaService

    def index= {
        render "existen $Persona.count personas"
    }

    def getPersona = {
        log.info(params.id)
        Persona persona =personaService.encontrarPersona(params.id)
        log.info(persona)
        render persona as JSON
    }

    def getAllPersonas =  {
        render personaService.todos() as JSON
    }

}
