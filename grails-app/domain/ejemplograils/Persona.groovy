package ejemplograils

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString(includeNames = true, includeFields = true, excludes = 'dateCreated,lastUpdated,metaClass')
@EqualsAndHashCode
class Persona {

    String nombre
    String apellido
    Long edad
    String mail

    static mapping = {
        version false
        table 'PERSONAS'
     }


    static constraints = {
        nombre blank: false, nullable: false
        apellido blank: false, nullable: false
        edad blank: false, nullable: false
        mail blank: false, nullable: true

    }
}
